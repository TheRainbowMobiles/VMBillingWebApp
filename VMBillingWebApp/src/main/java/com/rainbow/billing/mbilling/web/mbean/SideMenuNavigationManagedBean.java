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

/**
 * @author Nanjundan
 * 
 */
@ManagedBean(name="sidemenuBean")
@ViewScoped
public class SideMenuNavigationManagedBean {

	private MenuModel sideMenuNavigationModel;

	public SideMenuNavigationManagedBean() {
		sideMenuNavigationModel = new DefaultMenuModel();

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

		// Purchase submenu
		DefaultSubMenu purchaseSubmenu = new DefaultSubMenu("Purchase Submenu");
		item = new DefaultMenuItem("Purchase Entry");
		item.setUrl("http://www.rainbow");
		purchaseSubmenu.addElement(item);
		item = new DefaultMenuItem("Purchase Return");
		item.setUrl("http://www.rainbow");
		purchaseSubmenu.addElement(item);
		sideMenuNavigationModel.addElement(purchaseSubmenu);
		
		// Sales submenu
		DefaultSubMenu salesSubmenu = new DefaultSubMenu("Sales Submenu");
		item = new DefaultMenuItem("Sales Entry");
		item.setUrl("http://www.rainbow");
		salesSubmenu.addElement(item);
		item = new DefaultMenuItem("Sales Return");
		item.setUrl("http://www.rainbow");
		salesSubmenu.addElement(item);
		sideMenuNavigationModel.addElement(salesSubmenu);
		
		// Accessories submenu
		DefaultSubMenu accessoriesSubmenu = new DefaultSubMenu("Accessories Submenu");
		item = new DefaultMenuItem("Acc. Purchase Entry");
		item.setUrl("http://www.rainbow");
		accessoriesSubmenu.addElement(item);
		item = new DefaultMenuItem("Acc. Sales Entry");
		item.setUrl("http://www.rainbow");
		accessoriesSubmenu.addElement(item);
		sideMenuNavigationModel.addElement(accessoriesSubmenu);
				
		// Accounts submenu
		DefaultSubMenu accountsSubmenu = new DefaultSubMenu("Accounts Submenu");
		item = new DefaultMenuItem("Supplier Credits");
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
				
		// Reports submenu
		DefaultSubMenu reportsSubmenu = new DefaultSubMenu("Reports Submenu");
		item = new DefaultMenuItem("Supplier Credits");
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
		
		// Settings submenu
		DefaultSubMenu settingsSubmenu = new DefaultSubMenu("Settings Submenu");
		item = new DefaultMenuItem("Manage User");
		item.setUrl("http://www.rainbow");
		settingsSubmenu.addElement(item);
		item = new DefaultMenuItem("Manage User Access");
		item.setUrl("http://www.rainbow");
		settingsSubmenu.addElement(item);
		sideMenuNavigationModel.addElement(settingsSubmenu);
		
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
