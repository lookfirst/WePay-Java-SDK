package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * https://stage.wepay.com/developer/reference/user
 *
 * This call allows you to lookup the details of the user associated with the access token you are using to make the call.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class WePayUserDetailsRequest extends WePayRequest<WePayUserDetails> {

	/** */
	@Override
	public String getEndpoint() {
		return "/user";
	}
}