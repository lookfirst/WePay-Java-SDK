package com.lookfirst.wepay.api;

import java.io.Serializable;

import lombok.Data;

/**
 * Once you have sent the user through the authorization end point and they have returned with a code,
 * you can use that code to retrieve and access token for that user. The redirect uri will need to be
 * the same as in the in /v2/oauth2/authorize step
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
public class Token implements Serializable {
	private static final long serialVersionUID = 1L;

	/** The unique user ID of the user */
	private String userId;
	/** The access token that you can use to make calls on behalf of the user */
	private String accessToken;
	/** The token type - for now only "BEARER" is supported */
	private String tokenType;
	/** How much time till the access_token expires. If NULL or not present, the access token will be valid until the user revokes the access_token */
	private String expiresIn;
}