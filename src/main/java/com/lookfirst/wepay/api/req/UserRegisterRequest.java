package com.lookfirst.wepay.api.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.Token;

/**
 * https://stage.wepay.com/developer/reference/user
 *
 * Registers a new user and returns an access token for that user. If the call fails for any
 * reason the application must use the normal /oauth2/authorize flow to obtain authorization from the user.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class UserRegisterRequest extends WePayRequest<Token> {

	/** The integer client ID issued to the app, found on your application's dashboard */
	private Long clientId;
	/** The string client secret issued to the app, found on your application's dashboard */
	private String clientSecret;
	/** The email of the user you want to register */
	private String email;
	/** A comma separated list of permissions. */
	private String scope;
	/** The first name of the user you want to register */
	private String firstName;
	/** The last name of the user you want to register */
	private String lastName;
	/** The IP address of the user you want to register */
	private String originalIp;
	/** The user-agent (for web) or the IMEI (for mobile) of the user you want to register */
	private String originalDevice;
  /** The date the user accepted WePay's TOS. Must be a unix_timestamp. Required. */
	private String tosAcceptanceTime;
	/** The uri the user will be redirected to after they have confirmed they wanted to be registered on WePay. By default this will be your application's homepage. */
	private String redirectUri;
	/** The callback_uri you want to receive IPNs on. Must be a full URI. */
	private String callbackUri;

	/** */
	@Override
	public String getEndpoint() {
		return "/user/register";
	}
}
