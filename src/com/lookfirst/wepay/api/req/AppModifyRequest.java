package com.lookfirst.wepay.api.req;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.AppUri;
import com.lookfirst.wepay.api.ThemeObject;

/**
 * https://www.wepay.com/developer/reference/app
 *
 * This call lets you modify details of your API application (such as adding a theme for your app).
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class AppModifyRequest extends WePayRequest<AppUri> {

	/** The integer client ID issued to the app by WePay - see your client ID on your app screen. */
	private String clientId;
	/** The string client secret issued to the app by WePay - see your client secret on your app screen. */
	private String clientSecret;
	/** The theme object associated with the App (if applicable). */
	private ThemeObject themeObject;
	/** An array of Google Analytics domains associated with the app. */
	private List<String> gaqDomains;

	/** */
	@Override
	public String getEndpoint() {
		return "/app/modify";
	}
}