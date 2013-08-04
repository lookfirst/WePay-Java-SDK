package com.lookfirst.wepay.api.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.Preapproval;

/**
 * https://stage.wepay.com/developer/reference/preapproval
 *
 * This call allows you to modify the callback_uri on a preapproval.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class PreapprovalModifyRequest extends WePayRequest<Preapproval> {

	/** The unique ID of the preapproval you want to look up. */
	private Long preapprovalId;
	/** The uri that any instant payment notifications will be sent to. Needs to be a full uri (ex https://www.wepay.com ) and must NOT be localhost or 127.0.0.1 or include wepay.com. Max 2083 chars. */
	private String callbackUri;

	/** */
	@Override
	public String getEndpoint() {
		return "/preapproval/modify";
	}
}