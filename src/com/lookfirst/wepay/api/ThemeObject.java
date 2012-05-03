package com.lookfirst.wepay.api;

import java.io.Serializable;

import lombok.Data;

/**
 * If you want to customize the way the OAuth2 Authorization page, the iframe checkout, withdrawal flow, and API
 * emails look, this is the right tutorial. We provide you with a way to customize the colors used during these
 * flows so it will match the design of your site.
 * <p>
 * <a href="https://www.wepay.com/developer/tutorial/customization">https://www.wepay.com/developer/tutorial/customization</a>
 *
 * @author jon
 */
@Data
public class ThemeObject implements Serializable {
	private static final long serialVersionUID = 1L;

	/** Sets colors on important elements such as headers */
	public String primaryColor;
	/** Sets colors on secondary elements such as info boxes, and the focus styles on text inputs */
	public String secondaryColor;
	/** Sets the background color for the page frame on onsite pages, and the iframe background on iframe checkouts */
	public String backgroundColor;
	/** Sets the color on primary action buttons */
	public String buttonColor;
}
