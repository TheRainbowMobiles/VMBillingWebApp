/**
 * 
 */
package com.rainbow.billing.mbilling.common.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Nanjundan
 * 
 */
@SuppressWarnings("serial")
public class Mobile implements Serializable {

	private String imei1;
	private String imei2;
	private String brand;
	private String modelName;
	private String supplier;
	private String buyPrice;
	private String mrpPrice;
	private String dealerPrice;
	private String batteryNo;
	private String chargerNo;
	private Date purchaseDate;
	private String additionalSchemePrice;

	/**
	 * @return the imei1
	 */
	public String getImei1() {
		return imei1;
	}

	/**
	 * @param imei1
	 *            the imei1 to set
	 */
	public void setImei1(String imei1) {
		this.imei1 = imei1;
	}

	/**
	 * @return the imei2
	 */
	public String getImei2() {
		return imei2;
	}

	/**
	 * @param imei2
	 *            the imei2 to set
	 */
	public void setImei2(String imei2) {
		this.imei2 = imei2;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand
	 *            the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the modelName
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * @param modelName
	 *            the modelName to set
	 */
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	/**
	 * @return the supplier
	 */
	public String getSupplier() {
		return supplier;
	}

	/**
	 * @param supplier
	 *            the supplier to set
	 */
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	/**
	 * @return the buyPrice
	 */
	public String getBuyPrice() {
		return buyPrice;
	}

	/**
	 * @param buyPrice
	 *            the buyPrice to set
	 */
	public void setBuyPrice(String buyPrice) {
		this.buyPrice = buyPrice;
	}

	/**
	 * @return the mrpPrice
	 */
	public String getMrpPrice() {
		return mrpPrice;
	}

	/**
	 * @param mrpPrice
	 *            the mrpPrice to set
	 */
	public void setMrpPrice(String mrpPrice) {
		this.mrpPrice = mrpPrice;
	}

	/**
	 * @return the dealerPrice
	 */
	public String getDealerPrice() {
		return dealerPrice;
	}

	/**
	 * @param dealerPrice
	 *            the dealerPrice to set
	 */
	public void setDealerPrice(String dealerPrice) {
		this.dealerPrice = dealerPrice;
	}

	/**
	 * @return the batteryNo
	 */
	public String getBatteryNo() {
		return batteryNo;
	}

	/**
	 * @param batteryNo
	 *            the batteryNo to set
	 */
	public void setBatteryNo(String batteryNo) {
		this.batteryNo = batteryNo;
	}

	/**
	 * @return the chargerNo
	 */
	public String getChargerNo() {
		return chargerNo;
	}

	/**
	 * @param chargerNo
	 *            the chargerNo to set
	 */
	public void setChargerNo(String chargerNo) {
		this.chargerNo = chargerNo;
	}

	/**
	 * @return the purchaseDate
	 */
	public Date getPurchaseDate() {
		return purchaseDate;
	}

	/**
	 * @param purchaseDate
	 *            the purchaseDate to set
	 */
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	/**
	 * @return the additionalSchemePrice
	 */
	public String getAdditionalSchemePrice() {
		return additionalSchemePrice;
	}

	/**
	 * @param additionalSchemePrice
	 *            the additionalSchemePrice to set
	 */
	public void setAdditionalSchemePrice(String additionalSchemePrice) {
		this.additionalSchemePrice = additionalSchemePrice;
	}
}