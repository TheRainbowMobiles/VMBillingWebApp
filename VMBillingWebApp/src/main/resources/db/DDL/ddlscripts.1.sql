CREATE DATABASE `mob_store_billing`;
USE `mob_store_billing`;
CREATE TABLE `master_gen_status` (
  `GEN_STATUS_ID` int(11) NOT NULL,
  `MASTER_GEN_STATUS_DESC` varchar(50) NOT NULL,
  `MASTER_GEN_STATUS_COMMENTS` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`GEN_STATUS_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Company related DDL queries*/
CREATE TABLE `master_company` (
  `COMPANY_ID` int(11) NOT NULL AUTO_INCREMENT,
  `COMPANY_NAME` varchar(100) NOT NULL,
  `COMPANY_TIN` varchar(45) NOT NULL,
  `COMPANY_ADDRESS` varchar(200) NOT NULL,
  `COMAPNY_LICKEY` varchar(70) NOT NULL,
  `COMPANY_STATUS` int(11) NOT NULL,
  `COMPANY_ADDFLD_NBR1` int(11) DEFAULT NULL,
  `COMPANY_ADDFLD_NBR2` int(11) DEFAULT NULL,
  `COMPANY_ADDFLD_CHAR1` varchar(30) DEFAULT NULL,
  `COMPANY_ADDFLD_CHAR2` varchar(40) DEFAULT NULL,
  `COMPANY_ADDFLD_CHAR3` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`COMPANY_ID`),
  KEY `MSTER_COMPANY_GEN_STATUS_idx` (`COMPANY_STATUS`),
  CONSTRAINT `MSTER_COMPANY_GEN_STATUS_FK` FOREIGN KEY (`COMPANY_STATUS`) REFERENCES `master_gen_status` (`GEN_STATUS_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=macce;


CREATE TABLE `master_compbranch_ctgry` (
  `MASTER_COMPBRANCH_CTGRY_ID` int(11) NOT NULL AUTO_INCREMENT,
  `MASTER_COMPBRANCH_CTGR_DESC` varchar(50) NOT NULL,
  `MASTER_COMPBRANCH_CTGRY_ADDFLD_CHR1` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`MASTER_COMPBRANCH_CTGRY_ID`,`MASTER_COMPBRANCH_CTGR_DESC`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `master_comp_branch` (
  `MASTER_COMP_BRANCH_ID` int(11) NOT NULL AUTO_INCREMENT,
  `MASTER_COMP_BRANCH_COMPANY_ID` int(11) NOT NULL DEFAULT '0',
  `MASTER_COMP_BRANCH_CODE` varchar(10) NOT NULL,
  `MASTER_COMP_BRANCH_NAME` varchar(45) NOT NULL,
  `MASTER_COMP_BRANCH_ADDRESS` varchar(150) NOT NULL,
  `MASTER_COMP_BRANCH_STATUS` int(11) DEFAULT NULL,
  `MASTER_COMP_BRANCH_PERFORMACE` int(11) NOT NULL,
  `MASTER_COMP_BRANCH_STARTDT` date NOT NULL,
  `MASTER_COMP_BRANCH_CLOSEDDT` date DEFAULT NULL,
  `MASTER_COMP_BRANCHCATGY` int(11) NOT NULL,
  `MASTER_COMP_BRANCH_ADFLD_CHR1` varchar(50) DEFAULT NULL,
  `MASTER_COMP_BRANCH_ADFLD_CHR2` varchar(50) DEFAULT NULL,
  `MASTER_COMP_BRANCH_ADFLD_CHR3` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`MASTER_COMP_BRANCH_ID`,`MASTER_COMP_BRANCH_COMPANY_ID`),
  KEY `MASTER_COMPBRANCH_STATUS_FK_idx` (`MASTER_COMP_BRANCH_STATUS`),
  KEY `MASTER_COMPBRANCH_CTGY_FK_idx` (`MASTER_COMP_BRANCHCATGY`),
  KEY `MASTER_COMPBRANCH_COMP_FK_idx` (`MASTER_COMP_BRANCH_COMPANY_ID`),
  CONSTRAINT `MASTER_COMPBRANCH_COMP_FK` FOREIGN KEY (`MASTER_COMP_BRANCH_COMPANY_ID`) REFERENCES `master_company` (`COMPANY_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `MASTER_COMPBRANCH_CTGY_FK` FOREIGN KEY (`MASTER_COMP_BRANCHCATGY`) REFERENCES `master_compbranch_ctgry` (`MASTER_COMPBRANCH_CTGRY_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `MASTER_COMPBRANCH_STATUS_FK` FOREIGN KEY (`MASTER_COMP_BRANCH_STATUS`) REFERENCES `master_gen_status` (`GEN_STATUS_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

 
 /*Supplier related DDL queries*/

CREATE TABLE `master_mob_brand` (
  `MASTER_MOB_BRAND_ID` int(11) NOT NULL AUTO_INCREMENT,
  `MASTER_MOB_BRAND_DESC` varchar(45) NOT NULL,
  `MASTER_MOB_BRAND_STATUS` int(11) NOT NULL,
  PRIMARY KEY (`MASTER_MOB_BRAND_ID`),
  KEY `MASTER_MOB_BRAND_STATUS_FK_idx` (`MASTER_MOB_BRAND_STATUS`),
  CONSTRAINT `MASTER_MOB_BRAND_STATUS_FK` FOREIGN KEY (`MASTER_MOB_BRAND_STATUS`) REFERENCES `master_gen_status` (`GEN_STATUS_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Master table Mobile brand reference table';

CREATE TABLE `master_supplier` (
  `MASTER_SUPPLIER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `MASTER_SUPPLIER_NAME` varchar(50) NOT NULL,
  `MASTER_SUPPLIER_ADDRESS` varchar(100) NOT NULL,
  `MASTER_SUPPLIER_TAX` varchar(50) NOT NULL,
  `MASTER_SUPPLIER_PHMOB` varchar(15) NOT NULL,
  `MASTER_SUPPLIER_PHLL` varchar(15) NOT NULL,
  `MASTER_SUPPLIER_EMAIL` varchar(45) NOT NULL,
  `MASTER_SUPPLIER_WEBSITE` varchar(50) DEFAULT NULL,
  `MASTER_SUPPLIER_BRAND` int(11) NOT NULL,
  `MASTER_SUPPLIER_STATUS` int(11) NOT NULL,
  `MASTER_SUPPLIER_FEEDBACK` varchar(200) DEFAULT NULL,
  `MASTER_SUPPLIER_ADDFLD_CHAR1` varchar(50) DEFAULT NULL,
  `MASTER_SUPPLIER_ADDFLD_CHAR2` varchar(50) DEFAULT NULL,
  `MASTER_SUPPLIER_ADDFLD_CHAR3` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`MASTER_SUPPLIER_ID`),
  KEY `MASTER_SUPPLIER_BRAND_FK_idx` (`MASTER_SUPPLIER_BRAND`),
  KEY `MASTER_SUPPLIER_STATUS_FK_idx` (`MASTER_SUPPLIER_STATUS`),
  CONSTRAINT `MASTER_SUPPLIER_BRAND_FK` FOREIGN KEY (`MASTER_SUPPLIER_BRAND`) REFERENCES `master_mob_brand` (`MASTER_MOB_BRAND_STATUS`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `MASTER_SUPPLIER_STATUS_FK` FOREIGN KEY (`MASTER_SUPPLIER_STATUS`) REFERENCES `master_gen_status` (`GEN_STATUS_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


/* Product related DDL queries*/
CREATE TABLE `master_prod_category` (
  `MASTER_PROD_CATEGORY_ID` int(11) NOT NULL AUTO_INCREMENT,
  `MASTER_PROD_CATEGORY_DESC` varchar(100) NOT NULL,
  `MASTER_PROD_CATEGORY_ADDFLD_CHR1` varchar(50) DEFAULT NULL,
  `MASTER_PROD_CATEGORY_ADDFLD_CHR2` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`MASTER_PROD_CATEGORY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `master_prod_status` (
  `MASTER_PROD_STATUS_ID` int(11) NOT NULL AUTO_INCREMENT,
  `MASTER_PROD_STATUS_DESC` varchar(100) NOT NULL,
  `MASTER_PROD_STATUS_ADDFLD_CHR1` varchar(50) DEFAULT NULL,
  `MASTER_PROD_STATUS_ADDFLD_CHR2` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`MASTER_PROD_STATUS_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


/*Customer related DDL comments*/
CREATE TABLE `master_cust_type` (
  `MASTER_CUST_TYPE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `MASTER_CUST_TYPE_DESC` varchar(50) NOT NULL,
  `MASTER_CUST_TYPE_STATUS` int(11) NOT NULL,
  PRIMARY KEY (`MASTER_CUST_TYPE_ID`),
  KEY `MASTER_CUST_TYPE_STATUS_FK_idx` (`MASTER_CUST_TYPE_STATUS`),
  CONSTRAINT `MASTER_CUST_TYPE_STATUS_FK` FOREIGN KEY (`MASTER_CUST_TYPE_STATUS`) REFERENCES `master_gen_status` (`GEN_STATUS_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `master_cust_remdton` (
  `MASTER_CUST_RCMD_ID` int(11) NOT NULL AUTO_INCREMENT,
  `MASTER_CUST_RCMD_DESC` varchar(50) NOT NULL,
  `MASTER_CUST_RCMD_STATUS` int(11) NOT NULL,
  PRIMARY KEY (`MASTER_CUST_RCMD_ID`),
  KEY `MASTER_CUST_FDBK_STATUS_FK_idx` (`MASTER_CUST_RCMD_STATUS`),
  CONSTRAINT `MASTER_CUST_FDBK_STATUS_FK` FOREIGN KEY (`MASTER_CUST_RCMD_STATUS`) REFERENCES `master_gen_status` (`GEN_STATUS_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `master_customer` (
  `MASTER_CUSTOMERID` int(11) NOT NULL AUTO_INCREMENT,
  `MASTER_CUSTOMERNAME` varchar(50) NOT NULL,
  `MASTER_CUSTOMERMOB` varchar(15) NOT NULL,
  `MASTER_CUSTOMEREMAIL` varchar(45) DEFAULT NULL,
  `MASTER_CUSTOMERADDRESS` varchar(150) DEFAULT NULL,
  `MASTER_CUSTOMERTYPE` int(11) DEFAULT NULL,
  `MASTER_CUSTOMERRECOMMANDATION` int(11) NOT NULL,
  `MASTER_CUSTOMER_ADDFLD_CHR` varchar(50) DEFAULT NULL,
  `MASTER_CUSTOMER_ADDFLD_CHR2` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`MASTER_CUSTOMERID`),
  KEY `MASCUSTOMER_CUSTTYPE_FK_idx` (`MASTER_CUSTOMERTYPE`),
  KEY `MASCUSTOMER_CUSTRCMD_FK_idx` (`MASTER_CUSTOMERRECOMMANDATION`),
  CONSTRAINT `MASCUSTOMER_CUSTRCMD_FK` FOREIGN KEY (`MASTER_CUSTOMERRECOMMANDATION`) REFERENCES `master_cust_remdton` (`MASTER_CUST_RCMD_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `MASCUSTOMER_CUSTTYPE_FK` FOREIGN KEY (`MASTER_CUSTOMERTYPE`) REFERENCES `master_cust_type` (`MASTER_CUST_TYPE_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*User related DDL entries*/
CREATE TABLE `master_usr_secqns` (
  `MASTER_USR_SECQNS_ID` int(11) NOT NULL AUTO_INCREMENT,
  `MASTER_USR_SECQN_DESC` varchar(45) NOT NULL,
  PRIMARY KEY (`MASTER_USR_SECQNS_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `master_user_ctgry` (
  `MASTER_USER_TYPE_ID` int(11) NOT NULL DEFAULT '0',
  `MASTER_USER_TYPE_DESC` varchar(100) NOT NULL,
  PRIMARY KEY (`MASTER_USER_TYPE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `user` (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_HEXID` varchar(70) NOT NULL,
  `USER_NAME` varchar(10) NOT NULL,
  `USER_PASSWORD` varchar(50) NOT NULL,
  `USER_COMPANYID` int(11) NOT NULL,
  `USER_COMP_BRANCHID` int(11) NOT NULL,
  `USER_COMPBRNCH_ROLE` int(11) NOT NULL,
  `USER_EMPID` varchar(45) NOT NULL DEFAULT '0',
  `USER_MOBNO` varchar(15) NOT NULL,
  `USER_EMAIL` varchar(50) NOT NULL,
  `USER_RGD_DT` datetime DEFAULT NULL,
  `USER_LASTLOGIN_DT` datetime DEFAULT NULL,
  `USER_LOGIN_FAILURECOUNT` int(11) NOT NULL DEFAULT '0',
  `USER_SECQN_ID` int(11) NOT NULL,
  `USER_SECQN_QNSWER` varchar(50) NOT NULL,
  `USER_STATUS` int(11) NOT NULL,
  `USER_CATEGORY` int(11) NOT NULL,
  `USER_ADDFLD_CHR1` varchar(50) DEFAULT NULL,
  `USER_ADDFLD_CHR2` varchar(50) DEFAULT NULL,
  `USER_FULLNAME` varchar(50) NOT NULL,
  PRIMARY KEY (`USER_ID`),
  UNIQUE KEY `USER_NAME_UNIQUE` (`USER_NAME`),
  KEY `USER_STATUS_FK_idx` (`USER_STATUS`),
  KEY `USER_CATEGORY_FK_idx` (`USER_CATEGORY`),
  KEY `USER_SEQ_QN_FK_idx` (`USER_SECQN_ID`),
  CONSTRAINT `USER_SEQ_QN_FK` FOREIGN KEY (`USER_SECQN_ID`) REFERENCES `master_usr_secqns` (`MASTER_USR_SECQNS_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `USER_CATEGORY_FK` FOREIGN KEY (`USER_CATEGORY`) REFERENCES `master_user_ctgry` (`MASTER_USER_TYPE_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `USER_STATUS_FK` FOREIGN KEY (`USER_STATUS`) REFERENCES `master_gen_status` (`GEN_STATUS_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `master_role` (
  `MASTER_USER_ROLE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `MASTER_USER_ROLE_DESC` varchar(50) NOT NULL,
  `MASTER_USER_ROLE_STATUS` int(11) NOT NULL,
  `MASTER_USER_ROLE_ACCESS_SETTINGS` varchar(2000) NOT NULL,
  `MASTER_USER_ROLE_ADDFLD_CHR1` varchar(50) DEFAULT NULL,
  `MASTER_USER_ROLE_ADDFLD_CHR2` varchar(50) DEFAULT NULL,
  `MASTER_USER_ROLE_ADDFLD_CHr3` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`MASTER_USER_ROLE_ID`),
  KEY `MASTER_USER_ROLE_STATUS_FK_idx` (`MASTER_USER_ROLE_STATUS`),
  CONSTRAINT `MASTER_USER_ROLE_STATUS_FK` FOREIGN KEY (`MASTER_USER_ROLE_STATUS`) REFERENCES `master_gen_status` (`GEN_STATUS_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `user_role` (
  `USERID` int(11) NOT NULL DEFAULT '0',
  `ROLEID` int(11) NOT NULL DEFAULT '0',
  `BRANCHID` int(11) NOT NULL DEFAULT '0',
  `USER_ROLE_ACCESS_SETTINGS` varchar(4000) DEFAULT NULL,
  `USER_ROLE_ADDFLD_CHR1` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`USERID`,`ROLEID`,`BRANCHID`),
  KEY `USERROLE_USER_FK_idx` (`USERID`),
  KEY `USERROLE_ROLE_FK_idx` (`ROLEID`),
  KEY `USERROLE_BRANCH_FK_idx` (`BRANCHID`),
  CONSTRAINT `USERROLE_BRANCH_FK` FOREIGN KEY (`BRANCHID`) REFERENCES `master_comp_branch` (`MASTER_COMP_BRANCH_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `USERROLE_ROLE_FK` FOREIGN KEY (`ROLEID`) REFERENCES `master_role` (`MASTER_USER_ROLE_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `USERROLE_USER_FK` FOREIGN KEY (`USERID`) REFERENCES `user` (`USER_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Mobile purchase process*/
CREATE TABLE `prod_mob` (
  `PROD_MOB_ID` int(11) NOT NULL AUTO_INCREMENT,
  `PROD_MOB_UNQID` varchar(50) NOT NULL,
  `PROD_MOB_MODELNAME` varchar(50) NOT NULL,
  `PROD_MOB_BRAND` int(11) NOT NULL,
  `PROD_MOB_SUPPLIER` int(11) NOT NULL,
  `PROD_MOB_SUPPLIER_BILLNO` varchar(45) DEFAULT NULL,
  `PROD_MOB_SUPPLIER_BILLDT` date DEFAULT NULL,
  `PROD_MOB_STATUS` int(11) NOT NULL,
  PRIMARY KEY (`PROD_MOB_ID`),
  UNIQUE KEY `PROD_MOB_UNQID_UNIQUE` (`PROD_MOB_UNQID`),
  KEY `PROD_MOB_BRAND_FK_idx` (`PROD_MOB_BRAND`),
  KEY `PROD_MOB_SUPPLIER_FK_idx` (`PROD_MOB_SUPPLIER`),
  KEY `PROD_MOBILE_STATUS_FK_idx` (`PROD_MOB_STATUS`),
  CONSTRAINT `PROD_MOBILE_STATUS_FK` FOREIGN KEY (`PROD_MOB_STATUS`) REFERENCES `master_prod_status` (`MASTER_PROD_STATUS_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `PROD_MOB_BRAND_FK` FOREIGN KEY (`PROD_MOB_BRAND`) REFERENCES `master_mob_brand` (`MASTER_MOB_BRAND_STATUS`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `PROD_MOB_SUPPLIER_FK` FOREIGN KEY (`PROD_MOB_SUPPLIER`) REFERENCES `master_supplier` (`MASTER_SUPPLIER_BRAND`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `prod_mob_addinfo` (
  `PROD_MOB_ADDINFO_ID` int(11) NOT NULL DEFAULT '0',
  `PROD_MOB_MRP` decimal(6,2) DEFAULT NULL,
  `PROD_MOB_DP` decimal(6,2) DEFAULT NULL,
  `PROD_MOB_SCHEMEAMT` decimal(6,2) DEFAULT NULL,
  `PROD_MOB_BUYPRICE` decimal(6,2) DEFAULT NULL,
  `PROD_MOB_SELLPRICE` decimal(6,2) DEFAULT NULL,
  `PROD_MOB_TAXAMT` decimal(6,2) DEFAULT NULL,
  PRIMARY KEY (`PROD_MOB_ADDINFO_ID`),
  CONSTRAINT `PROD_MOB_ADD_FK` FOREIGN KEY (`PROD_MOB_ADDINFO_ID`) REFERENCES `prod_mob` (`PROD_MOB_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `prod_others` (
  `PROD_OTHERSID` int(11) NOT NULL AUTO_INCREMENT,
  `PROD_UNQID` varchar(50) NOT NULL,
  `PROD_NAME` varchar(50) NOT NULL,
  `PROD_BRAND` int(11) NOT NULL,
  `PROD_CATEGORY` int(11) NOT NULL,
  `PROD_BUYPRICE` decimal(5,2) DEFAULT NULL,
  `PROD_BUYDT` datetime DEFAULT NULL,
  `PROD_SELLPRICE` decimal(5,2) DEFAULT NULL,
  `PROD_SELLDT` datetime DEFAULT NULL,
  `PROD_RETURNAMOUNT` decimal(5,2) DEFAULT NULL,
  `PROD_RETURNDT` datetime DEFAULT NULL,
  PRIMARY KEY (`PROD_OTHERSID`),
  KEY `PROD_OTHERS_BRAND_FK_idx` (`PROD_BRAND`),
  KEY `PROD_OTHERS_CATGRY_FK_idx` (`PROD_CATEGORY`),
  CONSTRAINT `PROD_OTHERS_BRAND_FK` FOREIGN KEY (`PROD_BRAND`) REFERENCES `master_mob_brand` (`MASTER_MOB_BRAND_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `PROD_OTHERS_CATGRY_FK` FOREIGN KEY (`PROD_CATEGORY`) REFERENCES `master_prod_category` (`MASTER_PROD_CATEGORY_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `prod_tx_activity` (
  `PROD_TX_ACTIVITY_ID` int(11) NOT NULL AUTO_INCREMENT,
  `PROD_TX_PRODID` int(11) NOT NULL,
  `PROD_TX_ACTIONEDBY` int(11) NOT NULL,
  `PROD_TX_ACTIONEDDT` datetime NOT NULL,
  `PROD_TX_ACTIVITY_COMMENTS` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`PROD_TX_ACTIVITY_ID`),
  KEY `PROD_TX_PRODID_FK_idx` (`PROD_TX_PRODID`),
  KEY `PROD_TX_ACTIONUSR_FK_idx` (`PROD_TX_ACTIONEDBY`),
  CONSTRAINT `PROD_TX_ACTIONUSR_FK` FOREIGN KEY (`PROD_TX_ACTIONEDBY`) REFERENCES `user` (`USER_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `PROD_TX_PRODID_FK` FOREIGN KEY (`PROD_TX_PRODID`) REFERENCES `prod_mob` (`PROD_MOB_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*billing&accounting*/
CREATE TABLE `billpayment_customer` (
  `CUSTOMER_BILLPAYMENT_ID` int(11) NOT NULL AUTO_INCREMENT,
  `CUSTOMER_BILLNO` int(11) NOT NULL,
  `CUSTOMER_ID` int(11) NOT NULL,
  `CUSTOMER_PROD_ID` int(11) DEFAULT NULL,
  `CUSTOMER_BILLAMOUNT` decimal(5,2) NOT NULL,
  `CUSTOMER_BILLDT` datetime NOT NULL,
  `CUSTOMER_BILLPAYMENTREF` varchar(500) DEFAULT NULL,
  `CUSTOMER_PAIDAMOUNT` decimal(5,2) DEFAULT NULL,
  `CUSTOMER_PAIDDT` datetime DEFAULT NULL,
  `CUSTOMER_CREDITAMOUNT` decimal(5,2) DEFAULT NULL,
  `CUSTOMER_CREDITRCDDATE` datetime DEFAULT NULL,
  PRIMARY KEY (`CUSTOMER_BILLPAYMENT_ID`),
  UNIQUE KEY `CUSTOMER_BILLNO_UNIQUE` (`CUSTOMER_BILLNO`),
  KEY `CUST_BILLPAY_PRODID_FK_idx` (`CUSTOMER_PROD_ID`),
  KEY `CUST_BILLPAY__idx` (`CUSTOMER_ID`),
  CONSTRAINT `CUST_BILLPAY_CUSTID_FK` FOREIGN KEY (`CUSTOMER_ID`) REFERENCES `master_customer` (`MASTER_CUSTOMERID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `CUST_BILLPAY_PRODID_FK` FOREIGN KEY (`CUSTOMER_PROD_ID`) REFERENCES `prod_mob` (`PROD_MOB_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `billpayment_supplier` (
  `SUPPLIER_BILLPAYMENT_ID` int(11) NOT NULL AUTO_INCREMENT,
  `SUPPLIER_BILLNO` int(11) DEFAULT NULL,
  `SUPPLIER_BILLDT` date DEFAULT NULL,
  `SUPPLIER` int(11) NOT NULL,
  `SUPPLIER_BILLPAYMENT_AMT` decimal(7,2) DEFAULT NULL,
  `SUPPLIER_ORGPAYMENT_AMT` decimal(7,2) DEFAULT NULL,
  `SUPPLIER_ORGPAYMENTDT` date DEFAULT NULL,
  `SUPPLIER_ORGPAYMENT_REF` varchar(200) DEFAULT NULL,
  `SUPPLIER_BILL_COMMENTS` varchar(500) DEFAULT NULL,
  `SUPPLIER_BILL_IMG` blob,
  PRIMARY KEY (`SUPPLIER_BILLPAYMENT_ID`),
  KEY `BILL_PAYMENT_SUPPLIER_fk_idx` (`SUPPLIER`),
  CONSTRAINT `BILL_PAYMENT_SUPPLIER_fk` FOREIGN KEY (`SUPPLIER`) REFERENCES `master_supplier` (`MASTER_SUPPLIER_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `expense` (
  `EXPENSE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `EXP_TOWHOMPAID` varchar(50) NOT NULL,
  `EXP_PURPOSE` varchar(100) NOT NULL,
  `EXP_AMOUNT` decimal(5,2) NOT NULL,
  `EXP_PAIDDT` datetime NOT NULL,
  `EXP_COMMENTS` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`EXPENSE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;