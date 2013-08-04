package com.lookfirst.wepay.api.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.Preapproval;

/**
 * https://stage.wepay.com/developer/reference/preapproval
 *
 * Allows you to cancel the preapproval. If cancelled the preapproval cannot be used to execute payments.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class PreapprovalCancelRequest extends WePayRequest<Preapproval> {

	/** The unique ID of the preapproval you want to cancel. */
	private Long preapprovalId;

	/** */
	@Override
	public String getEndpoint() {
		return "/preapproval/cancel";
	}
}