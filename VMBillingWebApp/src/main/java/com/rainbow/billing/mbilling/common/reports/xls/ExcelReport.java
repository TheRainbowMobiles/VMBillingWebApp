/**
 * 
 */
package com.rainbow.billing.mbilling.common.reports.xls;

import java.io.IOException;
import java.io.InputStream;

import jxl.write.WriteException;

/**
 * @author Nanjundan
 * 
 */
public interface ExcelReport {
	public InputStream createExcel(Object inputForExccelCreation) throws IOException,WriteException;
}
