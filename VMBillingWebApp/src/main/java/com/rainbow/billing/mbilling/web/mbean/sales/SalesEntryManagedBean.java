/**
 * 
 */
package com.rainbow.billing.mbilling.web.mbean.sales;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.apache.log4j.Logger;
import org.primefaces.event.FlowEvent;

import com.rainbow.billing.mbilling.common.domain.Mobile;

/**
 * @author Nanjundan
 * 
 */
@ManagedBean(name="salesEntryManagedBean")
@ViewScoped
public class SalesEntryManagedBean {

	private Mobile mobile = new Mobile();

	private boolean skip;

	private static Logger logger = Logger.getLogger(SalesEntryManagedBean.class
			.getName());

	public void save(ActionEvent actionEvent) {
		// Persist mobile
		// End Result should be a BillNo instead of IMEI No
		FacesMessage msg = new FacesMessage("Successful", "Welcome :"
				+ mobile.getImei1());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	

	/**
	 * @return the mobile
	 */
	public Mobile getMobile() {
		return mobile;
	}



	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}



	public boolean isSkip() {
		return skip;
	}

	public void setSkip(boolean skip) {
		this.skip = skip;
	}

	public String onFlowProcess(FlowEvent event) {
		logger.info("Current wizard step:" + event.getOldStep());
		logger.info("Next step:" + event.getNewStep());

		if (skip) {
			skip = false; // reset in case user goes back
			return "confirm";
		} else {
			return event.getNewStep();
		}
	}

}