package com.lookfirst.wepay.api.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.Disbursement;

/**
 * https://stage.wepay.com/developer/reference/disbursement
 *
 * This call allows you to lookup the details of a disbursement. A disbursement is a collection
 * of monetary transfers from a WePay account to an email address.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class DisbursementRequest extends WePayRequest<Disbursement> {

	/** Yes	The unique ID of the disbursement you want to look up. */
	private String disbursementId;

	/** */
	@Override
	public String getEndpoint() {
		return "/disbursement";
	}
}