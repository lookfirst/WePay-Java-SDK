package com.lookfirst.wepay.api.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.Preapproval;

/**
 * https://stage.wepay.com/developer/reference/preapproval
 *
 * This call allows you to lookup the details of a payment preapproval on WePay.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class PreapprovalRequest extends WePayRequest<Preapproval> {

	/** The unique ID of the preapproval you want to look up. */
	private Long preapprovalId;

	/** */
	@Override
	public String getEndpoint() {
		return "/preapproval";
	}
}