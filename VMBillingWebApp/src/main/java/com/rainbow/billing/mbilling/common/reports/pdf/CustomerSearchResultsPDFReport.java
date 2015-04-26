/**
 * 
 */
package com.rainbow.billing.mbilling.common.reports.pdf;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.rainbow.billing.mbilling.vo.CustomerVO;

/**
 * @author Nanjundan
 * 
 */
public class CustomerSearchResultsPDFReport implements PDFReport {

	/**
	 * 
	 * @see com.rainbow.billing.mbilling.common.reports.pdf.PDFReport#cretaePDF(java.lang.Object)
	 */
	public InputStream cretaePDF(Object inputForPDFCreation) throws IOException, DocumentException {
		Document document = new Document();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PdfWriter.getInstance(document, baos);
		document.open();
		document.add(new Paragraph("Customer Search Result: genearted at"+new Date().toString()));
		document.add(Chunk.NEWLINE);
		document.add(addResults(inputForPDFCreation));
		document.close();
		InputStream inputStream  =  new ByteArrayInputStream(baos.toByteArray());
		return inputStream;
	}
	
	/**
	 * 
	 * @param inputForPDFCreation
	 */
	private PdfPTable addResults(Object inputForPDFCreation){
		PdfPTable customerSearchResults = new PdfPTable(6);
		customerSearchResults.setWidthPercentage(99f);
		Font reportHeaderFont = new Font(FontFamily.HELVETICA, 11, Font.BOLD, BaseColor.BLACK);
		Font reportContentFont = new Font(FontFamily.HELVETICA, 11, Font.NORMAL, BaseColor.BLACK);
		
		//Header1
		PdfPCell headerCell1 = new PdfPCell(new Phrase("Customer Name", reportHeaderFont));
		headerCell1.setHorizontalAlignment(Element.ALIGN_LEFT);
		headerCell1.setBackgroundColor(BaseColor.GRAY);
		customerSearchResults.addCell(headerCell1);
		
		//Header2
		PdfPCell headerCell2 = new PdfPCell(new Phrase("Customer Address", reportHeaderFont));
		headerCell2.setHorizontalAlignment(Element.ALIGN_LEFT);
		headerCell2.setBackgroundColor(BaseColor.GRAY);
		customerSearchResults.addCell(headerCell2);
		
		//Header3
		PdfPCell headerCell3 = new PdfPCell(new Phrase("Customer MobileNo", reportHeaderFont));
		headerCell3.setHorizontalAlignment(Element.ALIGN_LEFT);
		headerCell3.setBackgroundColor(BaseColor.GRAY);
		customerSearchResults.addCell(headerCell3);
				
		//Header4
		PdfPCell headerCell4 = new PdfPCell(new Phrase("Customer Email", reportHeaderFont));
		headerCell4.setHorizontalAlignment(Element.ALIGN_LEFT);
		headerCell4.setBackgroundColor(BaseColor.GRAY);
		customerSearchResults.addCell(headerCell4);
				
		//Header5
		PdfPCell headerCell5 = new PdfPCell(new Phrase("Customer SEG", reportHeaderFont));
		headerCell5.setHorizontalAlignment(Element.ALIGN_LEFT);
		headerCell5.setBackgroundColor(BaseColor.GRAY);
		customerSearchResults.addCell(headerCell5);
				
		//Header6
		PdfPCell headerCell6 = new PdfPCell(new Phrase("Customer TAX", reportHeaderFont));
		headerCell6.setHorizontalAlignment(Element.ALIGN_LEFT);
		headerCell6.setBackgroundColor(BaseColor.GRAY);
		customerSearchResults.addCell(headerCell6);
		
		List<CustomerVO> customerSearchResult = (List<CustomerVO>) inputForPDFCreation;
		for(CustomerVO customerVO:customerSearchResult){
			//Column1
			customerSearchResults.addCell(customerVO.getCustName());
			//Column2
			if (null!=customerVO.getCustAddress()) {
				customerSearchResults.addCell(customerVO.getCustAddress());
			} else {
				customerSearchResults.addCell("");
			}
			//Column3
			if (null!=customerVO.getCustMobileNo()) {
				customerSearchResults.addCell(customerVO.getCustMobileNo());
			} else {
				customerSearchResults.addCell("");
			}
			//Column4
			if (null!=customerVO.getCustEmail()) {
				customerSearchResults.addCell(customerVO.getCustEmail());
			} else {
				customerSearchResults.addCell("");
			}
			//Column5
			if (null!=customerVO.getCustomerSegDesc()) {
				customerSearchResults.addCell(customerVO.getCustomerSegDesc());
			} else {
				customerSearchResults.addCell("");
			}
			//Column6
			customerSearchResults.addCell("");
		}
		
		return customerSearchResults;
	}

}
