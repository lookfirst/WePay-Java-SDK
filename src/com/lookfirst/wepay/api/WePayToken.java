package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * Once you have sent the user through the authorization end point and they have returned with a code,
 * you can use that code to retrieve and access token for that user. The redirect uri and state
 * (if passed) will need to be the same as in the in /v2/oauth2/authorize step
 *
 * @author Jon Scott Stevens
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class WePayToken extends WePayRequest<WePayTokenResponse> {

	public static final String ENDPOINT = "/oauth2/token";

	/** Yes	The client ID issued to the app by WePay - see your client ID on your app screen */
	private String clientId;
	/** Yes	The uri the user will be redirected to after authorization. Must be the same as passed in /v2/oauth2/authorize */
	private String redirectUri;
	/** Yes	The client secret issued to the app by WePay - see your client secret on your app screen */
	private String clientSecret;
	/** Yes	The code returned by /v2/oauth2/authorize */
	private String code;

	/** */
	public WePayToken() {
		super(WePayTokenResponse.class);
	}

	/** */
	@Override
	public String getEndpoint() {
		return "/oauth2/token";
	}

}