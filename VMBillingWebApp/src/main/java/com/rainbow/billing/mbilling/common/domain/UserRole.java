package com.rainbow.billing.mbilling.common.domain;

// default package
// Generated Jul 4, 2014 8:21:11 PM by Hibernate Tools 3.3.0.GA

/**
 * UserRole generated by hbm2java
 */
public class UserRole implements java.io.Serializable {

	private UserRoleId id;
	private MasterRole masterRole;
	private User user;
	private MasterCompBranch masterCompBranch;
	private String userRoleAccessSettings;
	private String userRoleAddfldChr1;

	public UserRole() {
	}

	public UserRole(UserRoleId id, MasterRole masterRole, User user,
			MasterCompBranch masterCompBranch) {
		this.id = id;
		this.masterRole = masterRole;
		this.user = user;
		this.masterCompBranch = masterCompBranch;
	}

	public UserRole(UserRoleId id, MasterRole masterRole, User user,
			MasterCompBranch masterCompBranch, String userRoleAccessSettings,
			String userRoleAddfldChr1) {
		this.id = id;
		this.masterRole = masterRole;
		this.user = user;
		this.masterCompBranch = masterCompBranch;
		this.userRoleAccessSettings = userRoleAccessSettings;
		this.userRoleAddfldChr1 = userRoleAddfldChr1;
	}

	public UserRoleId getId() {
		return this.id;
	}

	public void setId(UserRoleId id) {
		this.id = id;
	}

	public MasterRole getMasterRole() {
		return this.masterRole;
	}

	public void setMasterRole(MasterRole masterRole) {
		this.masterRole = masterRole;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public MasterCompBranch getMasterCompBranch() {
		return this.masterCompBranch;
	}

	public void setMasterCompBranch(MasterCompBranch masterCompBranch) {
		this.masterCompBranch = masterCompBranch;
	}

	public String getUserRoleAccessSettings() {
		return this.userRoleAccessSettings;
	}

	public void setUserRoleAccessSettings(String userRoleAccessSettings) {
		this.userRoleAccessSettings = userRoleAccessSettings;
	}

	public String getUserRoleAddfldChr1() {
		return this.userRoleAddfldChr1;
	}

	public void setUserRoleAddfldChr1(String userRoleAddfldChr1) {
		this.userRoleAddfldChr1 = userRoleAddfldChr1;
	}

}
