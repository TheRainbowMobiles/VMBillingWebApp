/**
 * 
 */
package com.rainbow.billing.mbilling.web.mbean.purchase;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.rainbow.billing.mbilling.common.domain.Mobile;

/**
 * @author Nanjundan
 * 
 */
@ManagedBean(name = "purchaseEntryBean")
@ViewScoped
public class PurchaseEntryManagedBean {

	private Mobile mobile = new Mobile();
	private List<Mobile> mobiles = new ArrayList<Mobile>();

	public String reinit() {
		mobile = new Mobile();
		return null;
	}

	/**
	 * @return the mobile
	 */
	public Mobile getMobile() {
		return mobile;
	}

	/**
	 * @param mobile
	 *            the mobile to set
	 */
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the mobiles
	 */
	public List<Mobile> getMobiles() {
		return mobiles;
	}

	/**
	 * @param mobiles
	 *            the mobiles to set
	 */
	public void setMobiles(List<Mobile> mobiles) {
		this.mobiles = mobiles;
	}
}