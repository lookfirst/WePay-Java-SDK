package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * https://stage.wepay.com/developer/reference/user
 *
 * This call allows you to lookup the details of the user associated with the access token you are using to make the call.
 *
 * @author Jon Scott Stevens
 */
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class WePayUserDetails extends WePayRequest<WePayUserResponse> {


	/** */
	public WePayUserDetails() {
		super(WePayUserResponse.class);
	}

	/** */
	@Override
	public String getEndpoint() {
		return "/user";
	}
}