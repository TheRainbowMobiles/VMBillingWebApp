/**
 * 
 */
package com.rainbow.billing.mbilling.web.mbean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

import com.rainbow.billing.mbilling.common.util.MBillingConstants;

/**
 * @author Nanjundan
 * 
 */
@ManagedBean(name="sidemenuBean")
@ViewScoped
public class SideMenuNavigationManagedBean extends MBillingBaseBean {

	private MenuModel sideMenuNavigationModel;

	public SideMenuNavigationManagedBean() {
		sideMenuNavigationModel = new DefaultMenuModel();
		
		String currentNavFLow = null;
		if(null!=getValueFromSessionMap(MBillingConstants.CURRECT_APP_FLOW)){
			currentNavFLow= (String)getValueFromSessionMap(MBillingConstants.CURRECT_APP_FLOW);
		} else {
			//Default view/flow
			currentNavFLow = MBillingConstants.CURRECT_APP_FLOW_MASTER;
		}

		if(currentNavFLow.equals(MBillingConstants.CURRECT_APP_FLOW_MASTER)){
			// Master submenu
			DefaultSubMenu masterSubmenu = new DefaultSubMenu("Master Submenu");
			DefaultMenuItem item = new DefaultMenuItem("Company");
			item.setUrl("http://www.rainbow");
			masterSubmenu.addElement(item);
			item = new DefaultMenuItem("Supplier");
			item.setUrl("http://www.rainbow");
			masterSubmenu.addElement(item);
			item = new DefaultMenuItem("Customer");
			item.setUrl("http://www.rainbow");
			masterSubmenu.addElement(item);
			sideMenuNavigationModel.addElement(masterSubmenu);

		} else if (currentNavFLow.equals(MBillingConstants.CURRECT_APP_FLOW_PURCHASE)){
			// Purchase submenu
			DefaultSubMenu purchaseSubmenu = new DefaultSubMenu("Purchase Submenu");
			DefaultMenuItem item = new DefaultMenuItem("Purchase Entry");
			item.setUrl("http://www.rainbow");
			purchaseSubmenu.addElement(item);
			item = new DefaultMenuItem("Purchase Return");
			item.setUrl("http://www.rainbow");
			purchaseSubmenu.addElement(item);
			sideMenuNavigationModel.addElement(purchaseSubmenu);
			
		} else if (currentNavFLow.equals(MBillingConstants.CURRECT_APP_FLOW_SALES)){
			// Sales submenu
			DefaultSubMenu salesSubmenu = new DefaultSubMenu("Sales Submenu");
			DefaultMenuItem item = new DefaultMenuItem("Sales Entry");
			item.setUrl("http://www.rainbow");
			salesSubmenu.addElement(item);
			item = new DefaultMenuItem("Sales Return");
			item.setUrl("http://www.rainbow");
			salesSubmenu.addElement(item);
			sideMenuNavigationModel.addElement(salesSubmenu);
			
		} else if (currentNavFLow.equals(MBillingConstants.CURRECT_APP_FLOW_ACCESS)){
			// Accessories submenu
			DefaultSubMenu accessoriesSubmenu = new DefaultSubMenu("Accessories Submenu");
			DefaultMenuItem item = new DefaultMenuItem("Acc. Purchase Entry");
			item.setUrl("http://www.rainbow");
			accessoriesSubmenu.addElement(item);
			item = new DefaultMenuItem("Acc. Sales Entry");
			item.setUrl("http://www.rainbow");
			accessoriesSubmenu.addElement(item);
			sideMenuNavigationModel.addElement(accessoriesSubmenu);
			
		} else if (currentNavFLow.equals(MBillingConstants.CURRECT_APP_FLOW_ACCOUNTS)){
			// Accounts submenu
			DefaultSubMenu accountsSubmenu = new DefaultSubMenu("Accounts Submenu");
			DefaultMenuItem item = new DefaultMenuItem("Supplier Credits");
			item.setUrl("http://www.rainbow");
			accountsSubmenu.addElement(item);
			item = new DefaultMenuItem("Supplier Debits");
			item.setUrl("http://www.rainbow");
			accountsSubmenu.addElement(item);
			item = new DefaultMenuItem("Customer Credits");
			item.setUrl("http://www.rainbow");
			accountsSubmenu.addElement(item);
			item = new DefaultMenuItem("Customer Debits");
			item.setUrl("http://www.rainbow");
			accountsSubmenu.addElement(item);
			sideMenuNavigationModel.addElement(accountsSubmenu);
			
		} else if (currentNavFLow.equals(MBillingConstants.CURRECT_APP_FLOW_REPORTS)){
			// Reports submenu
			DefaultSubMenu reportsSubmenu = new DefaultSubMenu("Reports Submenu");
			DefaultMenuItem item = new DefaultMenuItem("Supplier Credits");
			item.setUrl("http://www.rainbow");
			reportsSubmenu.addElement(item);
			item = new DefaultMenuItem("Supplier Debits");
			item.setUrl("http://www.rainbow");
			reportsSubmenu.addElement(item);
			item = new DefaultMenuItem("Customer Credits");
			item.setUrl("http://www.rainbow");
			reportsSubmenu.addElement(item);
			item = new DefaultMenuItem("Customer Debits");
			item.setUrl("http://www.rainbow");
			reportsSubmenu.addElement(item);
			sideMenuNavigationModel.addElement(reportsSubmenu);
			
		} else if (currentNavFLow.equals(MBillingConstants.CURRECT_APP_FLOW_SETTINGS)){
			// Settings submenu
			DefaultSubMenu settingsSubmenu = new DefaultSubMenu("Settings Submenu");
			DefaultMenuItem item = new DefaultMenuItem("Manage User");
			item.setUrl("http://www.rainbow");
			settingsSubmenu.addElement(item);
			item = new DefaultMenuItem("Manage User Access");
			item.setUrl("http://www.rainbow");
			settingsSubmenu.addElement(item);
			sideMenuNavigationModel.addElement(settingsSubmenu);
			
		} else {
			//Defalut side menu item 
			
			//TODO:
		}
		
		//Below code can be used if there is any action required at the same page
		//Please refer http://www.primefaces.org/showcase/ui/menu.jsf for more details
		/*
		item = new DefaultMenuItem("Delete");
        item.setIcon("ui-icon-close");
        item.setCommand("#{menuBean.delete}");
        item.setAjax(false);
        secondSubmenu.addElement(item);
        */
	}

	/**
	 * @return the sideMenuNavigationModel
	 */
	public MenuModel getSideMenuNavigationModel() {
		return sideMenuNavigationModel;
	}

	public void save() {
		addMessage("Data saved");
	}

	public void update() {
		addMessage("Data updated");
	}

	public void delete() {
		addMessage("Data deleted");
	}

	public String redirect() {
		return "home?faces-redirect=true";
	}

	public void addMessage(String summary) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				summary, null);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

}
