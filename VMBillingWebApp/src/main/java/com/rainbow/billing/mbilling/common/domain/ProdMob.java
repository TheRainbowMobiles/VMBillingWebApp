package com.rainbow.billing.mbilling.common.domain;

// default package
// Generated Jul 4, 2014 8:21:11 PM by Hibernate Tools 3.3.0.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ProdMob generated by hbm2java
 */
public class ProdMob implements java.io.Serializable {

	private Integer prodMobId;
	private MasterSupplier masterSupplier;
	private MasterMobBrand masterMobBrand;
	private MasterProdStatus masterProdStatus;
	private String prodMobUnqid;
	private String prodMobModelname;
	private String prodMobSupplierBillno;
	private Date prodMobSupplierBilldt;
	private ProdMobAddinfo prodMobAddinfo;
	private Set billpaymentCustomers = new HashSet(0);
	private Set prodTxActivities = new HashSet(0);

	public ProdMob() {
	}

	public ProdMob(MasterSupplier masterSupplier,
			MasterMobBrand masterMobBrand, MasterProdStatus masterProdStatus,
			String prodMobUnqid, String prodMobModelname) {
		this.masterSupplier = masterSupplier;
		this.masterMobBrand = masterMobBrand;
		this.masterProdStatus = masterProdStatus;
		this.prodMobUnqid = prodMobUnqid;
		this.prodMobModelname = prodMobModelname;
	}

	public ProdMob(MasterSupplier masterSupplier,
			MasterMobBrand masterMobBrand, MasterProdStatus masterProdStatus,
			String prodMobUnqid, String prodMobModelname,
			String prodMobSupplierBillno, Date prodMobSupplierBilldt,
			ProdMobAddinfo prodMobAddinfo, Set billpaymentCustomers,
			Set prodTxActivities) {
		this.masterSupplier = masterSupplier;
		this.masterMobBrand = masterMobBrand;
		this.masterProdStatus = masterProdStatus;
		this.prodMobUnqid = prodMobUnqid;
		this.prodMobModelname = prodMobModelname;
		this.prodMobSupplierBillno = prodMobSupplierBillno;
		this.prodMobSupplierBilldt = prodMobSupplierBilldt;
		this.prodMobAddinfo = prodMobAddinfo;
		this.billpaymentCustomers = billpaymentCustomers;
		this.prodTxActivities = prodTxActivities;
	}

	public Integer getProdMobId() {
		return this.prodMobId;
	}

	public void setProdMobId(Integer prodMobId) {
		this.prodMobId = prodMobId;
	}

	public MasterSupplier getMasterSupplier() {
		return this.masterSupplier;
	}

	public void setMasterSupplier(MasterSupplier masterSupplier) {
		this.masterSupplier = masterSupplier;
	}

	public MasterMobBrand getMasterMobBrand() {
		return this.masterMobBrand;
	}

	public void setMasterMobBrand(MasterMobBrand masterMobBrand) {
		this.masterMobBrand = masterMobBrand;
	}

	public MasterProdStatus getMasterProdStatus() {
		return this.masterProdStatus;
	}

	public void setMasterProdStatus(MasterProdStatus masterProdStatus) {
		this.masterProdStatus = masterProdStatus;
	}

	public String getProdMobUnqid() {
		return this.prodMobUnqid;
	}

	public void setProdMobUnqid(String prodMobUnqid) {
		this.prodMobUnqid = prodMobUnqid;
	}

	public String getProdMobModelname() {
		return this.prodMobModelname;
	}

	public void setProdMobModelname(String prodMobModelname) {
		this.prodMobModelname = prodMobModelname;
	}

	public String getProdMobSupplierBillno() {
		return this.prodMobSupplierBillno;
	}

	public void setProdMobSupplierBillno(String prodMobSupplierBillno) {
		this.prodMobSupplierBillno = prodMobSupplierBillno;
	}

	public Date getProdMobSupplierBilldt() {
		return this.prodMobSupplierBilldt;
	}

	public void setProdMobSupplierBilldt(Date prodMobSupplierBilldt) {
		this.prodMobSupplierBilldt = prodMobSupplierBilldt;
	}

	public ProdMobAddinfo getProdMobAddinfo() {
		return this.prodMobAddinfo;
	}

	public void setProdMobAddinfo(ProdMobAddinfo prodMobAddinfo) {
		this.prodMobAddinfo = prodMobAddinfo;
	}

	public Set getBillpaymentCustomers() {
		return this.billpaymentCustomers;
	}

	public void setBillpaymentCustomers(Set billpaymentCustomers) {
		this.billpaymentCustomers = billpaymentCustomers;
	}

	public Set getProdTxActivities() {
		return this.prodTxActivities;
	}

	public void setProdTxActivities(Set prodTxActivities) {
		this.prodTxActivities = prodTxActivities;
	}

}