/**
 * 
 */
package com.rainbow.billing.mbilling.common.reports.xls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Locale;

import jxl.CellView;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.format.Alignment;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import com.rainbow.billing.mbilling.vo.CustomerVO;

/**
 * @author Nanjundan
 *
 */
public class CustomerSearchResultsXLSReport implements ExcelReport {
	private WritableCellFormat excelHeaderStyle;
	private WritableCellFormat excelContentStyle;
	
	/**
	 * @throws IOException 
	 * @throws WriteException 
	 * @see com.rainbow.billing.mbilling.common.reports.xls.ExcelReport#cretaeExcel(java.lang.Object)
	 */
	public InputStream createExcel(Object inputForExccelCreation) throws IOException, WriteException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		WorkbookSettings wbs = new WorkbookSettings();
		wbs.setLocale(new Locale("en", "EN"));
		
		WritableWorkbook workbook = Workbook.createWorkbook(baos, wbs);
		workbook.createSheet("Customer Search Results", 0);
		WritableSheet customersSearchXLSSheet  = workbook.getSheet(0);

		createLabel(customersSearchXLSSheet);
		createContent(customersSearchXLSSheet, inputForExccelCreation);
		
		workbook.write();
		workbook.close();
		InputStream inputStream = new ByteArrayInputStream(baos.toByteArray());
		return inputStream;
	}
	
	private void createLabel(WritableSheet customersSearchXLSSheet) throws WriteException{
		WritableFont arial11pt = new WritableFont(WritableFont.ARIAL, 11, WritableFont.BOLD);
		excelHeaderStyle = new WritableCellFormat(arial11pt);
		excelHeaderStyle.setShrinkToFit(true);
		excelHeaderStyle.setBackground(Colour.GREY_40_PERCENT);	
		excelHeaderStyle.setAlignment(Alignment.LEFT);
		excelHeaderStyle.setBorder(Border.ALL, BorderLineStyle.DOUBLE);
		
		CellView cv = new CellView();
		cv.setFormat(excelHeaderStyle);
		
		//write headers
		addColumnHeader(customersSearchXLSSheet, 0, 0, "Customer Name");
		addColumnHeader(customersSearchXLSSheet, 1, 0, "Customer Address");
		addColumnHeader(customersSearchXLSSheet, 2, 0, "Customer MobileNo");
		addColumnHeader(customersSearchXLSSheet, 3, 0, "Customer Email");
		addColumnHeader(customersSearchXLSSheet, 4, 0, "Customer Seg Desc");
		customersSearchXLSSheet.setColumnView(0, 20);
		customersSearchXLSSheet.setColumnView(1, 30);
		customersSearchXLSSheet.setColumnView(2, 20);
		customersSearchXLSSheet.setColumnView(3, 20);
		customersSearchXLSSheet.setColumnView(4, 10);
		
	}
	
	private void createContent(WritableSheet customersSearchXLSSheet, Object inputForExccelCreation) throws WriteException{
		WritableFont arial11pt = new WritableFont(WritableFont.ARIAL, 11, WritableFont.NO_BOLD);
		excelContentStyle = new WritableCellFormat(arial11pt);
		excelContentStyle.setShrinkToFit(true);
		excelContentStyle.setAlignment(Alignment.LEFT);
		excelContentStyle.setBorder(Border.ALL, BorderLineStyle.THIN);
		
		List<CustomerVO> customerVOList = (List<CustomerVO>) inputForExccelCreation;
		if(null!=customerVOList){
			for(int  i=1; i<=customerVOList.size();i++){
				CustomerVO customerVO =customerVOList.get(i-1); 
				//Column1
				addContentStrVal(customersSearchXLSSheet, 0, i, customerVO.getCustName());
				//Column2
				if(null!=customerVO.getCustAddress()){
					addContentStrVal(customersSearchXLSSheet, 0, i, customerVO.getCustAddress());
				} else {
					addContentStrVal(customersSearchXLSSheet, 0, i, "");
				}
				//Column3
				if(null!=customerVO.getCustMobileNo()){
					addContentStrVal(customersSearchXLSSheet, 0, i, customerVO.getCustMobileNo());
				} else {
					addContentStrVal(customersSearchXLSSheet, 0, i, "");
				}
				//Column4
				if(null!=customerVO.getCustEmail()){
					addContentStrVal(customersSearchXLSSheet, 0, i, customerVO.getCustEmail());
				} else {
					addContentStrVal(customersSearchXLSSheet, 0, i, "");
				}
				//Column5
				if(null!=customerVO.getCustomerSegDesc()){
					addContentStrVal(customersSearchXLSSheet, 0, i, customerVO.getCustomerSegDesc());
				} else {
					addContentStrVal(customersSearchXLSSheet, 0, i, "");
				}
			}
		} 
	}

	
	/**
	 * @throws WriteException 
	 * @throws RowsExceededException 
	 * 
	 */
	private void addColumnHeader(WritableSheet sheet, int column, int row, String val) throws RowsExceededException, WriteException{
		Label label = new Label(column, row, val, excelHeaderStyle);
		sheet.addCell(label);
	}
	
	
	private void addContentStrVal(WritableSheet sheet, int column, int row, String val) throws RowsExceededException, WriteException{
		Label value = new Label(column, row, val, excelContentStyle);
		sheet.addCell(value);
	}
	
	private void addContentNbrVal(WritableSheet sheet, int column, int row, Integer val) throws RowsExceededException, WriteException{
		Number number = new Number(column, row, val, excelContentStyle);
		sheet.addCell(number);
	}
}
