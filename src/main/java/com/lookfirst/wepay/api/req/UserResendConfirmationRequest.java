package com.lookfirst.wepay.api.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.WePayUser;

/**
 * https://stage.wepay.com/developer/reference/user
 *
 * For users who were registered via the /user/register call, this API call lets you resend the API registration confirmation email.
 *
 * There are no arguments necessary for this call. Only an access token is required.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 * @deprecated https://www.wepay.com/developer/reference/user-2011-01-15
 */
@Data
@EqualsAndHashCode(callSuper=false)
@Deprecated
public class UserResendConfirmationRequest extends WePayRequest<WePayUser> {

	/** */
	@Override
	public String getEndpoint() {
		return "/user/resend_confirmation";
	}
}