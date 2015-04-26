/**
 * 
 */
package com.rainbow.billing.mbilling.common.reports.pdf;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.DocumentException;
import com.rainbow.billing.mbilling.common.util.PDFReportConstants;
import com.rainbow.billing.mbilling.web.util.FacesUtils;

/**
 * @author Nanjundan
 * 
 */
public class PDFReportGenerator {
	private static final int DEFAULT_BUFFER_SIZE = 2048;// 2KB
	private static final Map<String, String> pdfLookupMap;
	static {
		pdfLookupMap = new HashMap<String, String>(10);
		pdfLookupMap
				.put(PDFReportConstants.CUSTOMER_SEARCH_RESULTS_REPORT_PDF_KEY,
						PDFReportConstants.CUSTOMER_SEARCH_RESULTS_REPORT_PDF_IMPLCLASS);
	}

	/**
	 * Generic method to Generate PDF report..
	 * 
	 * @param reportId
	 * @param inputForPDFGeneration
	 */
	public static void generatePDF(String reportId, Object inputForPDFGeneration) {
		HttpServletResponse servletResponse = FacesUtils.getServletResponse();
		BufferedOutputStream output = null;
		BufferedInputStream input = null;
		String pdfReportClassName = (String) pdfLookupMap.get(reportId);
		if (null != inputForPDFGeneration) {
			try {
				PDFReport pdfReport = (PDFReport) Class.forName(pdfReportClassName).newInstance();
				input = new BufferedInputStream(pdfReport.cretaePDF(inputForPDFGeneration));
				servletResponse.reset();
				servletResponse.setHeader("Content-Type", "application/pdf");
				servletResponse.setHeader("Content-Length", "");
				output = new BufferedOutputStream(servletResponse.getOutputStream(), DEFAULT_BUFFER_SIZE);
				//write file content into response
				byte[] buffer = new byte[DEFAULT_BUFFER_SIZE];
				int length;
				while((length=input.read(buffer))>0 ){
					output.write(buffer, 0, length);
				}
				output.flush();
				
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		FacesUtils.getFacesContext().responseComplete();
	}
}