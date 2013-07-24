package com.lookfirst.wepay.api.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.WePayUser;

/**
 * https://stage.wepay.com/developer/reference/user
 *
 * This call allows you to add a callback_uri to the user object.
 * If you add a callback_uri you will receive IPNs with the user_id each
 * time the user revokes their access_token or is deleted.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class UserModifyRequest extends WePayRequest<WePayUser> {

	/** The callback_uri you want to receive IPNs on. Must be a full URI. */
	private String callback_uri;

	/** */
	@Override
	public String getEndpoint() {
		return "/user/modify";
	}
}