package com.lookfirst.wepay.api.req;

import com.lookfirst.wepay.api.WePayUser;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * https://stage.wepay.com/developer/reference/user
 *
 * For users who were registered via the /user/register call, this API call lets you resend the API registration confirmation email.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class UserSendConfirmationRequest extends WePayRequest<WePayUser> {

	/** A short message that will be included in the email to the user. */
	private String emailMessage;

	/** */
	@Override
	public String getEndpoint() {
		return "/user/send_confirmation";
	}
}