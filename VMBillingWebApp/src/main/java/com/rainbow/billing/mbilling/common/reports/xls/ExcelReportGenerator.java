/**
 * 
 */
package com.rainbow.billing.mbilling.common.reports.xls;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import jxl.write.WriteException;

import com.itextpdf.text.DocumentException;
import com.rainbow.billing.mbilling.common.util.ExcelReportConstants;
import com.rainbow.billing.mbilling.common.util.PDFReportConstants;
import com.rainbow.billing.mbilling.web.util.FacesUtils;

/**
 * @author Nanjundan
 * 
 */
public class ExcelReportGenerator {
	private static final int DEFAULT_BUFFER_SIZE = 2048;// 2KB
	private static final Map<String, String> excelLookupMap;
	static {
		excelLookupMap = new HashMap<String, String>(10);
		excelLookupMap.put(ExcelReportConstants.CUSTOMER_SEARCH_RESULTS_REPORT_XLS_KEY,
						ExcelReportConstants.CUSTOMER_SEARCH_RESULTS_REPORT_XLS_IMPLCLASS);
	}

	/**
	 * Generic method to Generate Excel report..
	 * 
	 * @param reportId
	 * @param inputForPDFGeneration
	 */
	public static void generateExcel(String reportId, Object inputForExcelGeneration) {
		HttpServletResponse servletResponse = FacesUtils.getServletResponse();
		BufferedOutputStream output = null;
		BufferedInputStream input = null;
		String excelReportClassName = (String) excelLookupMap.get(reportId);
		if (null != inputForExcelGeneration) {
			try {
				ExcelReport excelReport = (ExcelReport) Class.forName(excelReportClassName).newInstance();
				input = new BufferedInputStream(excelReport.createExcel(inputForExcelGeneration));
				servletResponse.reset();
				servletResponse.setHeader("Content-Type", "application/vnd.ms-excel");
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
			} catch (WriteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		FacesUtils.getFacesContext().responseComplete();
	}
}