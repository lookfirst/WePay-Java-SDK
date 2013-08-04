package com.lookfirst.wepay.api.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.WePayUser;

/**
 * https://stage.wepay.com/developer/reference/user
 *
 * This call allows you to lookup the details of the user associated with the access token you are using to make the call.
 *
 * There are no arguments necessary for this call. Only an access token is required.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class UserRequest extends WePayRequest<WePayUser> {

	/** */
	@Override
	public String getEndpoint() {
		return "/user";
	}
}