package com.rainbow.billing.mbilling.common.domain;

// default package
// Generated Jul 4, 2014 8:21:11 PM by Hibernate Tools 3.3.0.GA

import java.util.Date;

/**
 * ProdTxActivity generated by hbm2java
 */
public class ProdTxActivity implements java.io.Serializable {

	private Integer prodTxActivityId;
	private User user;
	private ProdMob prodMob;
	private Date prodTxActioneddt;
	private String prodTxActivityComments;

	public ProdTxActivity() {
	}

	public ProdTxActivity(User user, ProdMob prodMob, Date prodTxActioneddt) {
		this.user = user;
		this.prodMob = prodMob;
		this.prodTxActioneddt = prodTxActioneddt;
	}

	public ProdTxActivity(User user, ProdMob prodMob, Date prodTxActioneddt,
			String prodTxActivityComments) {
		this.user = user;
		this.prodMob = prodMob;
		this.prodTxActioneddt = prodTxActioneddt;
		this.prodTxActivityComments = prodTxActivityComments;
	}

	public Integer getProdTxActivityId() {
		return this.prodTxActivityId;
	}

	public void setProdTxActivityId(Integer prodTxActivityId) {
		this.prodTxActivityId = prodTxActivityId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ProdMob getProdMob() {
		return this.prodMob;
	}

	public void setProdMob(ProdMob prodMob) {
		this.prodMob = prodMob;
	}

	public Date getProdTxActioneddt() {
		return this.prodTxActioneddt;
	}

	public void setProdTxActioneddt(Date prodTxActioneddt) {
		this.prodTxActioneddt = prodTxActioneddt;
	}

	public String getProdTxActivityComments() {
		return this.prodTxActivityComments;
	}

	public void setProdTxActivityComments(String prodTxActivityComments) {
		this.prodTxActivityComments = prodTxActivityComments;
	}

}
