/**
 * 
 */
package com.rainbow.billing.mbilling.web.mbean;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author Nanjundan
 * 
 */
public class MBillingBaseBean {

	/**
	 * Method to get the External Conmtext
	 * 
	 * @return
	 */
	public ExternalContext getExternalFacesContext() {
		return FacesContext.getCurrentInstance().getExternalContext();
	}
	
	/**
	 * Get request value from Request parameter Map
	 * 
	 * @return
	 */
	public String getValueFromReqParamMap(String reqMapKey) {
		return getExternalFacesContext().getRequestParameterMap()
				.get(reqMapKey);
	}

	/**
	 * Get request value from Request Map
	 * 
	 * @return
	 */
	public Object getValueFromReqMap(String reqMapKey) {
		return getExternalFacesContext().getRequestMap().get(reqMapKey);
	}

	/**
	 * Store request value to Request Map
	 * 
	 * @return
	 */
	public void storeValueToReqMap(String reqMapKey, Object reqMapValue) {
		getExternalFacesContext().getRequestMap().put(reqMapKey, reqMapValue);
	}

	/**
	 * Get request value from Session Map
	 * 
	 * @return
	 */
	public Object getValueFromSessionMap(String sessMapKey) {
		return getExternalFacesContext().getSessionMap().get(sessMapKey);
	}
}