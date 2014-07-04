/**
 * 
 */
package com.rainbow.billing.mbilling.web.mbean.master;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * @author Nanjundan
 * 
 */
@ManagedBean(name = "masterCustomerBean")
@RequestScoped
public class MasterCustomerManagedBean {
	private String custName;
	private String custAddress;
	private String custMobileNo;
	private String custEmail;
	private String custType;
	/**
	 * @return the custName
	 */
	public String getCustName() {
		return custName;
	}
	/**
	 * @param custName the custName to set
	 */
	public void setCustName(String custName) {
		this.custName = custName;
	}
	/**
	 * @return the custAddress
	 */
	public String getCustAddress() {
		return custAddress;
	}
	/**
	 * @param custAddress the custAddress to set
	 */
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	/**
	 * @return the custMobileNo
	 */
	public String getCustMobileNo() {
		return custMobileNo;
	}
	/**
	 * @param custMobileNo the custMobileNo to set
	 */
	public void setCustMobileNo(String custMobileNo) {
		this.custMobileNo = custMobileNo;
	}
	/**
	 * @return the custEmail
	 */
	public String getCustEmail() {
		return custEmail;
	}
	/**
	 * @param custEmail the custEmail to set
	 */
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	/**
	 * @return the custType
	 */
	public String getCustType() {
		return custType;
	}
	/**
	 * @param custType the custType to set
	 */
	public void setCustType(String custType) {
		this.custType = custType;
	}
	
	/**
	 * Method to return the list of customers
	 * 
	 * @return
	 */
	public List getCustomers(){
		return null;
	}

}