/**
 * 
 */
package com.rainbow.billing.mbilling.web.mbean.master;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.event.DashboardReorderEvent;
import org.primefaces.model.DashboardColumn;
import org.primefaces.model.DashboardModel;
import org.primefaces.model.DefaultDashboardColumn;
import org.primefaces.model.DefaultDashboardModel;

/**
 * @author Nanjundan
 * 
 */
@ManagedBean(name = "masterSupplierBean")
@RequestScoped
public class MasterSupplierManagedBean {
	private String supplierName;
	private String address;
	private String tax;
	private String mobileNo;
	private String landLineNo;
	private String email;
	private String website;
	private String brand;
	
	private DashboardModel mstSupplierModel;

	public MasterSupplierManagedBean() {
		mstSupplierModel = new DefaultDashboardModel();
		DashboardColumn column1 = new DefaultDashboardColumn();
		DashboardColumn column2 = new DefaultDashboardColumn();

		column1.addWidget("Add New Supplier");
		column2.addWidget("Supplier list");

		mstSupplierModel.addColumn(column1);
		mstSupplierModel.addColumn(column2);
	}

	/**
	 * Event to handle Dashboard Menu action
	 * 
	 * @param event
	 */
	public void handleSupplierAction(DashboardReorderEvent event) {
		FacesMessage message = new FacesMessage();
		message.setSeverity(FacesMessage.SEVERITY_INFO);
		message.setSummary("Reordered: " + event.getWidgetId());
		message.setDetail("Item index: " + event.getItemIndex()
				+ ", Column index: " + event.getColumnIndex()
				+ ", Sender index: " + event.getSenderColumnIndex());

		addMessage(message);
	}
	
	/**
	 * Add user Event action
	 * 
	 * @return
	 */
	public String addSupplier() {
		System.out.println("Added supplier successfully!");
		return null;
	}
	
	/**
	 * Method to reset the supplier details provide in UI
	 * 
	 * @return
	 */
	public String resetSupplier() {
		System.out.println("Reset supplier successfully!");
		return null;
	}

	/**
	 * Method to search the supplier details provide in UI
	 * 
	 * @return
	 */
	public void searchSupplier(ActionEvent actionEvent) {
		System.out.println("searchSupplier successfully!");
		return;
	}

	
	/**
	 * Adding faces message to UI
	 * 
	 * @param message
	 */
	private void addMessage(FacesMessage message) {
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	
	/**
	 * Method to return the list of suppliers
	 * 
	 * @return
	 */
	public List getSuppliers(){
		return null;
	}

	/**
	 * 
	 * @return
	 */
	public DashboardModel getMstSupplierModel() {
		return mstSupplierModel;
	}
	
	/**
	 * @return the supplierName
	 */
	public String getSupplierName() {
		return supplierName;
	}

	/**
	 * @param supplierName the supplierName to set
	 */
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the tax
	 */
	public String getTax() {
		return tax;
	}

	/**
	 * @param tax the tax to set
	 */
	public void setTax(String tax) {
		this.tax = tax;
	}

	/**
	 * @return the mobileNo
	 */
	public String getMobileNo() {
		return mobileNo;
	}

	/**
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	/**
	 * @return the landLineNo
	 */
	public String getLandLineNo() {
		return landLineNo;
	}

	/**
	 * @param landLineNo the landLineNo to set
	 */
	public void setLandLineNo(String landLineNo) {
		this.landLineNo = landLineNo;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the website
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * @param website the website to set
	 */
	public void setWebsite(String website) {
		this.website = website;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}