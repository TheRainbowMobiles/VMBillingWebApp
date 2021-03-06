package com.rainbow.billing.mbilling.common.domain;

// default package
// Generated Jul 4, 2014 8:21:11 PM by Hibernate Tools 3.3.0.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

	private Integer userId;
	private MasterGenStatus masterGenStatus;
	private MasterUsrSecqns masterUsrSecqns;
	private MasterUserCtgry masterUserCtgry;
	private String userHexid;
	private String userName;
	private String userPassword;
	private int userCompanyid;
	private int userCompBranchid;
	private int userCompbrnchRole;
	private String userEmpid;
	private String userMobno;
	private String userEmail;
	private Date userRgdDt;
	private Date userLastloginDt;
	private int userLoginFailurecount;
	private String userSecqnQnswer;
	private String userAddfldChr1;
	private String userAddfldChr2;
	private String userFullname;
	private Set userRoles = new HashSet(0);
	private Set prodTxActivities = new HashSet(0);

	public User() {
	}

	public User(MasterGenStatus masterGenStatus,
			MasterUsrSecqns masterUsrSecqns, MasterUserCtgry masterUserCtgry,
			String userHexid, String userName, String userPassword,
			int userCompanyid, int userCompBranchid, int userCompbrnchRole,
			String userEmpid, String userMobno, String userEmail,
			int userLoginFailurecount, String userSecqnQnswer,
			String userFullname) {
		this.masterGenStatus = masterGenStatus;
		this.masterUsrSecqns = masterUsrSecqns;
		this.masterUserCtgry = masterUserCtgry;
		this.userHexid = userHexid;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userCompanyid = userCompanyid;
		this.userCompBranchid = userCompBranchid;
		this.userCompbrnchRole = userCompbrnchRole;
		this.userEmpid = userEmpid;
		this.userMobno = userMobno;
		this.userEmail = userEmail;
		this.userLoginFailurecount = userLoginFailurecount;
		this.userSecqnQnswer = userSecqnQnswer;
		this.userFullname = userFullname;
	}

	public User(MasterGenStatus masterGenStatus,
			MasterUsrSecqns masterUsrSecqns, MasterUserCtgry masterUserCtgry,
			String userHexid, String userName, String userPassword,
			int userCompanyid, int userCompBranchid, int userCompbrnchRole,
			String userEmpid, String userMobno, String userEmail,
			Date userRgdDt, Date userLastloginDt, int userLoginFailurecount,
			String userSecqnQnswer, String userAddfldChr1,
			String userAddfldChr2, String userFullname, Set userRoles,
			Set prodTxActivities) {
		this.masterGenStatus = masterGenStatus;
		this.masterUsrSecqns = masterUsrSecqns;
		this.masterUserCtgry = masterUserCtgry;
		this.userHexid = userHexid;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userCompanyid = userCompanyid;
		this.userCompBranchid = userCompBranchid;
		this.userCompbrnchRole = userCompbrnchRole;
		this.userEmpid = userEmpid;
		this.userMobno = userMobno;
		this.userEmail = userEmail;
		this.userRgdDt = userRgdDt;
		this.userLastloginDt = userLastloginDt;
		this.userLoginFailurecount = userLoginFailurecount;
		this.userSecqnQnswer = userSecqnQnswer;
		this.userAddfldChr1 = userAddfldChr1;
		this.userAddfldChr2 = userAddfldChr2;
		this.userFullname = userFullname;
		this.userRoles = userRoles;
		this.prodTxActivities = prodTxActivities;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public MasterGenStatus getMasterGenStatus() {
		return this.masterGenStatus;
	}

	public void setMasterGenStatus(MasterGenStatus masterGenStatus) {
		this.masterGenStatus = masterGenStatus;
	}

	public MasterUsrSecqns getMasterUsrSecqns() {
		return this.masterUsrSecqns;
	}

	public void setMasterUsrSecqns(MasterUsrSecqns masterUsrSecqns) {
		this.masterUsrSecqns = masterUsrSecqns;
	}

	public MasterUserCtgry getMasterUserCtgry() {
		return this.masterUserCtgry;
	}

	public void setMasterUserCtgry(MasterUserCtgry masterUserCtgry) {
		this.masterUserCtgry = masterUserCtgry;
	}

	public String getUserHexid() {
		return this.userHexid;
	}

	public void setUserHexid(String userHexid) {
		this.userHexid = userHexid;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public int getUserCompanyid() {
		return this.userCompanyid;
	}

	public void setUserCompanyid(int userCompanyid) {
		this.userCompanyid = userCompanyid;
	}

	public int getUserCompBranchid() {
		return this.userCompBranchid;
	}

	public void setUserCompBranchid(int userCompBranchid) {
		this.userCompBranchid = userCompBranchid;
	}

	public int getUserCompbrnchRole() {
		return this.userCompbrnchRole;
	}

	public void setUserCompbrnchRole(int userCompbrnchRole) {
		this.userCompbrnchRole = userCompbrnchRole;
	}

	public String getUserEmpid() {
		return this.userEmpid;
	}

	public void setUserEmpid(String userEmpid) {
		this.userEmpid = userEmpid;
	}

	public String getUserMobno() {
		return this.userMobno;
	}

	public void setUserMobno(String userMobno) {
		this.userMobno = userMobno;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Date getUserRgdDt() {
		return this.userRgdDt;
	}

	public void setUserRgdDt(Date userRgdDt) {
		this.userRgdDt = userRgdDt;
	}

	public Date getUserLastloginDt() {
		return this.userLastloginDt;
	}

	public void setUserLastloginDt(Date userLastloginDt) {
		this.userLastloginDt = userLastloginDt;
	}

	public int getUserLoginFailurecount() {
		return this.userLoginFailurecount;
	}

	public void setUserLoginFailurecount(int userLoginFailurecount) {
		this.userLoginFailurecount = userLoginFailurecount;
	}

	public String getUserSecqnQnswer() {
		return this.userSecqnQnswer;
	}

	public void setUserSecqnQnswer(String userSecqnQnswer) {
		this.userSecqnQnswer = userSecqnQnswer;
	}

	public String getUserAddfldChr1() {
		return this.userAddfldChr1;
	}

	public void setUserAddfldChr1(String userAddfldChr1) {
		this.userAddfldChr1 = userAddfldChr1;
	}

	public String getUserAddfldChr2() {
		return this.userAddfldChr2;
	}

	public void setUserAddfldChr2(String userAddfldChr2) {
		this.userAddfldChr2 = userAddfldChr2;
	}

	public String getUserFullname() {
		return this.userFullname;
	}

	public void setUserFullname(String userFullname) {
		this.userFullname = userFullname;
	}

	public Set getUserRoles() {
		return this.userRoles;
	}

	public void setUserRoles(Set userRoles) {
		this.userRoles = userRoles;
	}

	public Set getProdTxActivities() {
		return this.prodTxActivities;
	}

	public void setProdTxActivities(Set prodTxActivities) {
		this.prodTxActivities = prodTxActivities;
	}

}
