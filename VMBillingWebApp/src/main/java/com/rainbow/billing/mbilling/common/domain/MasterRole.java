package com.rainbow.billing.mbilling.common.domain;

// default package
// Generated Jul 4, 2014 8:21:11 PM by Hibernate Tools 3.3.0.GA

import java.util.HashSet;
import java.util.Set;

/**
 * MasterRole generated by hbm2java
 */
public class MasterRole implements java.io.Serializable {

	private Integer masterUserRoleId;
	private MasterGenStatus masterGenStatus;
	private String masterUserRoleDesc;
	private String masterUserRoleAccessSettings;
	private String masterUserRoleAddfldChr1;
	private String masterUserRoleAddfldChr2;
	private String masterUserRoleAddfldChr3;
	private Set userRoles = new HashSet(0);

	public MasterRole() {
	}

	public MasterRole(MasterGenStatus masterGenStatus,
			String masterUserRoleDesc, String masterUserRoleAccessSettings) {
		this.masterGenStatus = masterGenStatus;
		this.masterUserRoleDesc = masterUserRoleDesc;
		this.masterUserRoleAccessSettings = masterUserRoleAccessSettings;
	}

	public MasterRole(MasterGenStatus masterGenStatus,
			String masterUserRoleDesc, String masterUserRoleAccessSettings,
			String masterUserRoleAddfldChr1, String masterUserRoleAddfldChr2,
			String masterUserRoleAddfldChr3, Set userRoles) {
		this.masterGenStatus = masterGenStatus;
		this.masterUserRoleDesc = masterUserRoleDesc;
		this.masterUserRoleAccessSettings = masterUserRoleAccessSettings;
		this.masterUserRoleAddfldChr1 = masterUserRoleAddfldChr1;
		this.masterUserRoleAddfldChr2 = masterUserRoleAddfldChr2;
		this.masterUserRoleAddfldChr3 = masterUserRoleAddfldChr3;
		this.userRoles = userRoles;
	}

	public Integer getMasterUserRoleId() {
		return this.masterUserRoleId;
	}

	public void setMasterUserRoleId(Integer masterUserRoleId) {
		this.masterUserRoleId = masterUserRoleId;
	}

	public MasterGenStatus getMasterGenStatus() {
		return this.masterGenStatus;
	}

	public void setMasterGenStatus(MasterGenStatus masterGenStatus) {
		this.masterGenStatus = masterGenStatus;
	}

	public String getMasterUserRoleDesc() {
		return this.masterUserRoleDesc;
	}

	public void setMasterUserRoleDesc(String masterUserRoleDesc) {
		this.masterUserRoleDesc = masterUserRoleDesc;
	}

	public String getMasterUserRoleAccessSettings() {
		return this.masterUserRoleAccessSettings;
	}

	public void setMasterUserRoleAccessSettings(
			String masterUserRoleAccessSettings) {
		this.masterUserRoleAccessSettings = masterUserRoleAccessSettings;
	}

	public String getMasterUserRoleAddfldChr1() {
		return this.masterUserRoleAddfldChr1;
	}

	public void setMasterUserRoleAddfldChr1(String masterUserRoleAddfldChr1) {
		this.masterUserRoleAddfldChr1 = masterUserRoleAddfldChr1;
	}

	public String getMasterUserRoleAddfldChr2() {
		return this.masterUserRoleAddfldChr2;
	}

	public void setMasterUserRoleAddfldChr2(String masterUserRoleAddfldChr2) {
		this.masterUserRoleAddfldChr2 = masterUserRoleAddfldChr2;
	}

	public String getMasterUserRoleAddfldChr3() {
		return this.masterUserRoleAddfldChr3;
	}

	public void setMasterUserRoleAddfldChr3(String masterUserRoleAddfldChr3) {
		this.masterUserRoleAddfldChr3 = masterUserRoleAddfldChr3;
	}

	public Set getUserRoles() {
		return this.userRoles;
	}

	public void setUserRoles(Set userRoles) {
		this.userRoles = userRoles;
	}

}