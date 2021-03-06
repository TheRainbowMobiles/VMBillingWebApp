package com.rainbow.billing.mbilling.common.domain;

// default package
// Generated Jul 4, 2014 8:21:11 PM by Hibernate Tools 3.3.0.GA

import java.util.HashSet;
import java.util.Set;

/**
 * MasterUserCtgry generated by hbm2java
 */
public class MasterUserCtgry implements java.io.Serializable {

	private int masterUserTypeId;
	private String masterUserTypeDesc;
	private Set users = new HashSet(0);

	public MasterUserCtgry() {
	}

	public MasterUserCtgry(int masterUserTypeId, String masterUserTypeDesc) {
		this.masterUserTypeId = masterUserTypeId;
		this.masterUserTypeDesc = masterUserTypeDesc;
	}

	public MasterUserCtgry(int masterUserTypeId, String masterUserTypeDesc,
			Set users) {
		this.masterUserTypeId = masterUserTypeId;
		this.masterUserTypeDesc = masterUserTypeDesc;
		this.users = users;
	}

	public int getMasterUserTypeId() {
		return this.masterUserTypeId;
	}

	public void setMasterUserTypeId(int masterUserTypeId) {
		this.masterUserTypeId = masterUserTypeId;
	}

	public String getMasterUserTypeDesc() {
		return this.masterUserTypeDesc;
	}

	public void setMasterUserTypeDesc(String masterUserTypeDesc) {
		this.masterUserTypeDesc = masterUserTypeDesc;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

}
