/**
 * 
 */
package com.rainbow.billing.mbilling.web.util;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Nanjundan
 *
 */
public class FacesUtils {
   
	public static FacesContext getFacesContext(){
		return FacesContext.getCurrentInstance();
	}
	
	public static ExternalContext getExternalContext(){
		return getFacesContext().getExternalContext();
	}
	
	public static HttpServletResponse getServletResponse(){
		return (HttpServletResponse)getExternalContext().getResponse();
	}
	
}
