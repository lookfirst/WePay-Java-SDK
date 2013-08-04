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
public class AppUri implements Serializable {
	private static final long serialVersionUID = 1L;

	/** The unique ID of the app. */
	private String clientId;
	/** The approval status of the API application. */
	private String status;
	/** The theme object associated with the App (if applicable). */
	private ThemeObject themeObject;
	/** An array of Google Analytics domains associated with the app. */
	private List<String> gaqDomains;
}