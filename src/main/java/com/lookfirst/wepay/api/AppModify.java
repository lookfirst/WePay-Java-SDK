package com.lookfirst.wepay.api;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * https://www.wepay.com/developer/reference/app
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
public class AppModify implements Serializable {
	private static final long serialVersionUID = 1L;

	/** The unique integer user ID of the user */
	private String userId;
	/** The string access token that you can use to make calls on behalf of the user */
	private String accessToken;
	/** The theme object associated with the App (if applicable). */
	private ThemeObject themeObject;
	/** An array of Google Analytics domains associated with the app. */
	private List<String> gaqDomains;
}