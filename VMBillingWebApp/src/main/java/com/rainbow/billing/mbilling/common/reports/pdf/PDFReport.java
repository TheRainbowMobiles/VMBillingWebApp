/**
 * 
 */
package com.rainbow.billing.mbilling.common.reports.pdf;

import java.io.IOException;
import java.io.InputStream;

import com.itextpdf.text.DocumentException;

/**
 * @author Nanjundan
 *
 */
public interface PDFReport {
	public InputStream cretaePDF(Object inputForPDFCreation) throws IOException, DocumentException;
}
