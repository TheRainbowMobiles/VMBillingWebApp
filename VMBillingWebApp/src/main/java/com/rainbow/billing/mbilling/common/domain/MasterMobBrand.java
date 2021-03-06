package com.rainbow.billing.mbilling.common.domain;

// default package
// Generated Jul 4, 2014 8:21:11 PM by Hibernate Tools 3.3.0.GA

import java.util.HashSet;
import java.util.Set;

/**
 * MasterMobBrand generated by hbm2java
 */
public class MasterMobBrand implements java.io.Serializable {

	private Integer masterMobBrandId;
	private MasterGenStatus masterGenStatus;
	private String masterMobBrandDesc;
	private Set prodOtherses = new HashSet(0);
	private Set prodMobs = new HashSet(0);
	private Set masterSuppliers = new HashSet(0);

	public MasterMobBrand() {
	}

	public MasterMobBrand(MasterGenStatus masterGenStatus,
			String masterMobBrandDesc) {
		this.masterGenStatus = masterGenStatus;
		this.masterMobBrandDesc = masterMobBrandDesc;
	}

	public MasterMobBrand(MasterGenStatus masterGenStatus,
			String masterMobBrandDesc, Set prodOtherses, Set prodMobs,
			Set masterSuppliers) {
		this.masterGenStatus = masterGenStatus;
		this.masterMobBrandDesc = masterMobBrandDesc;
		this.prodOtherses = prodOtherses;
		this.prodMobs = prodMobs;
		this.masterSuppliers = masterSuppliers;
	}

	public Integer getMasterMobBrandId() {
		return this.masterMobBrandId;
	}

	public void setMasterMobBrandId(Integer masterMobBrandId) {
		this.masterMobBrandId = masterMobBrandId;
	}

	public MasterGenStatus getMasterGenStatus() {
		return this.masterGenStatus;
	}

	public void setMasterGenStatus(MasterGenStatus masterGenStatus) {
		this.masterGenStatus = masterGenStatus;
	}

	public String getMasterMobBrandDesc() {
		return this.masterMobBrandDesc;
	}

	public void setMasterMobBrandDesc(String masterMobBrandDesc) {
		this.masterMobBrandDesc = masterMobBrandDesc;
	}

	public Set getProdOtherses() {
		return this.prodOtherses;
	}

	public void setProdOtherses(Set prodOtherses) {
		this.prodOtherses = prodOtherses;
	}

	public Set getProdMobs() {
		return this.prodMobs;
	}

	public void setProdMobs(Set prodMobs) {
		this.prodMobs = prodMobs;
	}

	public Set getMasterSuppliers() {
		return this.masterSuppliers;
	}

	public void setMasterSuppliers(Set masterSuppliers) {
		this.masterSuppliers = masterSuppliers;
	}

}
