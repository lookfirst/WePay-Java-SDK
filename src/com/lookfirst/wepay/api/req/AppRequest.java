package com.lookfirst.wepay.api.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.AppUri;

/**
 * https://stage.wepay.com/developer/reference/account
 *
 * This call allows you to lookup the details of your API application.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class AppRequest extends WePayRequest<AppUri> {

	/** The integer client ID issued to the app by WePay - see your client ID on your app screen. */
	private String clientId;
	/** The string client secret issued to the app by WePay - see your client secret on your app screen. */
	private String clientSecret;

	/** */
	@Override
	public String getEndpoint() {
		return "/app";
	}
}