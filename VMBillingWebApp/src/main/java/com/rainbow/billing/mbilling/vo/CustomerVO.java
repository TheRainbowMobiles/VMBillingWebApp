/**
 * 
 */
package com.rainbow.billing.mbilling.vo;

/**
 * @author Nanjundan
 * 
 */
public class CustomerVO {
	private int customerSegType;
	private String CustomerSegDesc;
	private String custName;
	private String custAddress;
	private String custMobileNo;
	private String custEmail;

	/**
	 * @return the customerSegType
	 */
	public int getCustomerSegType() {
		return customerSegType;
	}

	/**
	 * @param customerSegType
	 *            the customerSegType to set
	 */
	public void setCustomerSegType(int customerSegType) {
		this.customerSegType = customerSegType;
	}

	/**
	 * @return the customerSegDesc
	 */
	public String getCustomerSegDesc() {
		return CustomerSegDesc;
	}

	/**
	 * @param customerSegDesc the customerSegDesc to set
	 */
	public void setCustomerSegDesc(String customerSegDesc) {
		CustomerSegDesc = customerSegDesc;
	}

	/**
	 * @return the custName
	 */
	public String getCustName() {
		return custName;
	}

	/**
	 * @param custName
	 *            the custName to set
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
	 * @param custAddress
	 *            the custAddress to set
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
	 * @param custMobileNo
	 *            the custMobileNo to set
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
	 * @param custEmail
	 *            the custEmail to set
	 */
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	/**
	 * Method to return the list of customers
	 * 
	 * @return
	 */

}
