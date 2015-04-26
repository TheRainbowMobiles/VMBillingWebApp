/**
 * 
 */
package com.rainbow.billing.mbilling.web.mbean.master;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.rainbow.billing.mbilling.common.reports.pdf.PDFReportGenerator;
import com.rainbow.billing.mbilling.common.reports.xls.ExcelReportGenerator;
import com.rainbow.billing.mbilling.common.util.ExcelReportConstants;
import com.rainbow.billing.mbilling.common.util.PDFReportConstants;
import com.rainbow.billing.mbilling.vo.CustomerVO;

/**
 * @author Nanjundan
 * 
 */
@ManagedBean(name = "masterCustomerBean")
@RequestScoped
public class MasterCustomerManagedBean {
	private CustomerVO customerVO;
	//Below is for test only
	private List<CustomerVO> customerList;
	
	public MasterCustomerManagedBean(){
		customerVO = new CustomerVO();
		customerList = new ArrayList<CustomerVO>(2);
		
		CustomerVO customerVO1 = new CustomerVO();
		customerVO1.setCustName("AAA");
		customerVO1.setCustAddress("Address1");
		customerVO1.setCustMobileNo("1234567890");
		customerVO1.setCustEmail("cust1.gamil.com");
		customerVO1.setCustomerSegDesc("RETAIL");
		
		CustomerVO customerVO2 = new CustomerVO();
		customerVO2.setCustName("BBBB");
		customerVO2.setCustAddress("Address1");
		customerVO2.setCustMobileNo("9876543210");
		customerVO2.setCustEmail("cust2.gamil.com");
		customerVO2.setCustomerSegDesc("RETAIL");
		
		customerList.add(customerVO1);
		customerList.add(customerVO2);
	}
	
	
	
	/**
	 * @return the customerVO
	 */
	public CustomerVO getCustomerVO() {
		return customerVO;
	}

	/**
	 * @param customerVO the customerVO to set
	 */
	public void setCustomerVO(CustomerVO customerVO) {
		this.customerVO = customerVO;
	}
	
	/**
	 * Method to get the Customers List..
	 * 
	 * @return
	 */
	public List<CustomerVO> getCustomers(){
		return customerList;
	}
	
	/**
	 * 
	 * @return
	 */
	public String searchcustomerExportPDF(){
		PDFReportGenerator.generatePDF(PDFReportConstants.CUSTOMER_SEARCH_RESULTS_REPORT_PDF_KEY, customerList);
		return null;
	}

	/**
	 * 
	 * @return
	 */
	public String searchcustomerExportXLS(){
		ExcelReportGenerator.generateExcel(ExcelReportConstants.CUSTOMER_SEARCH_RESULTS_REPORT_XLS_KEY, customerList);
		return null;
	}

}