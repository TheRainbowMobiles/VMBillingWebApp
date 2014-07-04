package com.rainbow.billing.mbilling.common.domain;

// default package
// Generated Jul 4, 2014 8:21:11 PM by Hibernate Tools 3.3.0.GA

import java.math.BigDecimal;
import java.util.Date;

/**
 * ProdOthers generated by hbm2java
 */
public class ProdOthers implements java.io.Serializable {

	private Integer prodOthersid;
	private MasterProdCategory masterProdCategory;
	private MasterMobBrand masterMobBrand;
	private String prodUnqid;
	private String prodName;
	private BigDecimal prodBuyprice;
	private Date prodBuydt;
	private BigDecimal prodSellprice;
	private Date prodSelldt;
	private BigDecimal prodReturnamount;
	private Date prodReturndt;

	public ProdOthers() {
	}

	public ProdOthers(MasterProdCategory masterProdCategory,
			MasterMobBrand masterMobBrand, String prodUnqid, String prodName) {
		this.masterProdCategory = masterProdCategory;
		this.masterMobBrand = masterMobBrand;
		this.prodUnqid = prodUnqid;
		this.prodName = prodName;
	}

	public ProdOthers(MasterProdCategory masterProdCategory,
			MasterMobBrand masterMobBrand, String prodUnqid, String prodName,
			BigDecimal prodBuyprice, Date prodBuydt, BigDecimal prodSellprice,
			Date prodSelldt, BigDecimal prodReturnamount, Date prodReturndt) {
		this.masterProdCategory = masterProdCategory;
		this.masterMobBrand = masterMobBrand;
		this.prodUnqid = prodUnqid;
		this.prodName = prodName;
		this.prodBuyprice = prodBuyprice;
		this.prodBuydt = prodBuydt;
		this.prodSellprice = prodSellprice;
		this.prodSelldt = prodSelldt;
		this.prodReturnamount = prodReturnamount;
		this.prodReturndt = prodReturndt;
	}

	public Integer getProdOthersid() {
		return this.prodOthersid;
	}

	public void setProdOthersid(Integer prodOthersid) {
		this.prodOthersid = prodOthersid;
	}

	public MasterProdCategory getMasterProdCategory() {
		return this.masterProdCategory;
	}

	public void setMasterProdCategory(MasterProdCategory masterProdCategory) {
		this.masterProdCategory = masterProdCategory;
	}

	public MasterMobBrand getMasterMobBrand() {
		return this.masterMobBrand;
	}

	public void setMasterMobBrand(MasterMobBrand masterMobBrand) {
		this.masterMobBrand = masterMobBrand;
	}

	public String getProdUnqid() {
		return this.prodUnqid;
	}

	public void setProdUnqid(String prodUnqid) {
		this.prodUnqid = prodUnqid;
	}

	public String getProdName() {
		return this.prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public BigDecimal getProdBuyprice() {
		return this.prodBuyprice;
	}

	public void setProdBuyprice(BigDecimal prodBuyprice) {
		this.prodBuyprice = prodBuyprice;
	}

	public Date getProdBuydt() {
		return this.prodBuydt;
	}

	public void setProdBuydt(Date prodBuydt) {
		this.prodBuydt = prodBuydt;
	}

	public BigDecimal getProdSellprice() {
		return this.prodSellprice;
	}

	public void setProdSellprice(BigDecimal prodSellprice) {
		this.prodSellprice = prodSellprice;
	}

	public Date getProdSelldt() {
		return this.prodSelldt;
	}

	public void setProdSelldt(Date prodSelldt) {
		this.prodSelldt = prodSelldt;
	}

	public BigDecimal getProdReturnamount() {
		return this.prodReturnamount;
	}

	public void setProdReturnamount(BigDecimal prodReturnamount) {
		this.prodReturnamount = prodReturnamount;
	}

	public Date getProdReturndt() {
		return this.prodReturndt;
	}

	public void setProdReturndt(Date prodReturndt) {
		this.prodReturndt = prodReturndt;
	}

}