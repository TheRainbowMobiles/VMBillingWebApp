/**
 * 
 */
package com.rainbow.billing.mbilling.web.mbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.rainbow.billing.mbilling.common.util.MBillingConstants;

/**
 * @author Nanjundan
 *
 */
@ManagedBean(name="headerBean")
@ViewScoped
public class MBillingHeaderBean extends MBillingBaseBean {
	
	/**
	 * Method to navigate the current work flow Master.
	 * @return
	 */
	public String goToMasterHome(){
		storeValueToSessionMap(MBillingConstants.CURRECT_APP_FLOW, MBillingConstants.CURRECT_APP_FLOW_MASTER);
		return "/pages/master/mst_supplier.jsf";
	}

	/**
	 * Method to navigate the current work flow Purchase.
	 * @return
	 */
	public String goToPurchaseHome(){
		storeValueToSessionMap(MBillingConstants.CURRECT_APP_FLOW, MBillingConstants.CURRECT_APP_FLOW_PURCHASE);
		return "/pages/purchase/pur_entry.jsf";
	}
	
	/**
	 * Method to navigate the current work flow Sales.
	 * @return
	 */
	public String goToSalesHome(){
		storeValueToSessionMap(MBillingConstants.CURRECT_APP_FLOW, MBillingConstants.CURRECT_APP_FLOW_SALES);
		return "/pages/sales/sal_entry.jsf";
	}
	
	/**
	 * Method to navigate the current work flow Accdessories.
	 * @return
	 */
	public String goToAccessoriesHome(){
		storeValueToSessionMap(MBillingConstants.CURRECT_APP_FLOW, MBillingConstants.CURRECT_APP_FLOW_ACCESS);
		return "/pages/accs/accshome.jsf";
	}
	
	/**
	 * Method to navigate the current work flow Accounts.
	 * @return
	 */
	public String goToAccountsHome(){
		storeValueToSessionMap(MBillingConstants.CURRECT_APP_FLOW, MBillingConstants.CURRECT_APP_FLOW_ACCOUNTS);
		return "/pages/accounts/accounts.jsf";
	}
	
	/**
	 * Method to navigate the current work flow Reports.
	 * @return
	 */
	public String goToReportsHome(){
		storeValueToSessionMap(MBillingConstants.CURRECT_APP_FLOW, MBillingConstants.CURRECT_APP_FLOW_REPORTS);
		return "/pages/reports/reportshome.jsf";
	}
	
	/**
	 * Method to navigate the current work flow Settings.
	 * @return
	 */
	public String goToSettingsHome(){
		storeValueToSessionMap(MBillingConstants.CURRECT_APP_FLOW, MBillingConstants.CURRECT_APP_FLOW_SETTINGS);
		return "/pages/settings/settingshome.jsf";
	}
	
	/**
	 * Method to navigate the current work flow SIM Management.
	 * @return
	 */
	public String goToSIMMgmtHome(){
		storeValueToSessionMap(MBillingConstants.CURRECT_APP_FLOW, MBillingConstants.CURRECT_APP_FLOW_SIMMGMT);
		return "/pages/simmgmt/simmgmthome.jsf";
	}
}
