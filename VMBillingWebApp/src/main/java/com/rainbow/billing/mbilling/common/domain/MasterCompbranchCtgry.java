package com.rainbow.billing.mbilling.common.domain;

// default package
// Generated Jul 4, 2014 8:21:11 PM by Hibernate Tools 3.3.0.GA

import java.util.HashSet;
import java.util.Set;

/**
 * MasterCompbranchCtgry generated by hbm2java
 */
public class MasterCompbranchCtgry implements java.io.Serializable {

	private Integer masterCompbranchCtgryId;
	private String masterCompbranchCtgrDesc;
	private String masterCompbranchCtgryAddfldChr1;
	private Set masterCompBranchs = new HashSet(0);

	public MasterCompbranchCtgry() {
	}

	public MasterCompbranchCtgry(String masterCompbranchCtgrDesc) {
		this.masterCompbranchCtgrDesc = masterCompbranchCtgrDesc;
	}

	public MasterCompbranchCtgry(String masterCompbranchCtgrDesc,
			String masterCompbranchCtgryAddfldChr1, Set masterCompBranchs) {
		this.masterCompbranchCtgrDesc = masterCompbranchCtgrDesc;
		this.masterCompbranchCtgryAddfldChr1 = masterCompbranchCtgryAddfldChr1;
		this.masterCompBranchs = masterCompBranchs;
	}

	public Integer getMasterCompbranchCtgryId() {
		return this.masterCompbranchCtgryId;
	}

	public void setMasterCompbranchCtgryId(Integer masterCompbranchCtgryId) {
		this.masterCompbranchCtgryId = masterCompbranchCtgryId;
	}

	public String getMasterCompbranchCtgrDesc() {
		return this.masterCompbranchCtgrDesc;
	}

	public void setMasterCompbranchCtgrDesc(String masterCompbranchCtgrDesc) {
		this.masterCompbranchCtgrDesc = masterCompbranchCtgrDesc;
	}

	public String getMasterCompbranchCtgryAddfldChr1() {
		return this.masterCompbranchCtgryAddfldChr1;
	}

	public void setMasterCompbranchCtgryAddfldChr1(
			String masterCompbranchCtgryAddfldChr1) {
		this.masterCompbranchCtgryAddfldChr1 = masterCompbranchCtgryAddfldChr1;
	}

	public Set getMasterCompBranchs() {
		return this.masterCompBranchs;
	}

	public void setMasterCompBranchs(Set masterCompBranchs) {
		this.masterCompBranchs = masterCompBranchs;
	}

}
