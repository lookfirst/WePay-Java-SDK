package com.lookfirst.wepay.api.req;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.Call;

/**
 * https://stage.wepay.com/developer/reference/batch
 *
 * Creates a batch call that will allow you to make multiple API calls within a single API call.
 * Each call will have a reference_id that can be used to identify that call. In addition, an
 * access_token will be passed for each call in the list, allowing you to make batch API calls for multiple users.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class BatchCreateRequest extends WePayRequest<Call> {

	/** The integer client ID issued to the app by WePay - see your client ID on your app screen. */
	private Long clientId;

	/** The string client secret issued to the app by WePay - see your client secret on your app screen. */
	private String clientSecret;

	/** An array of the API calls that you would like to make. Each API call should have a "call" parameter,
	 * an "authorization" parameter -- access token for the user that is making the API call, a unique
	 * "reference_id", and an array of the "parameters" for the API call.  */
	private List<Call> calls;

	/** */
	@Override
	public String getEndpoint() {
		return "/batch/create";
	}
}