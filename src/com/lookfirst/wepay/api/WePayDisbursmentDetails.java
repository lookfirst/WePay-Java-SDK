package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

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
@ToString
@EqualsAndHashCode(callSuper=false)
public class WePayDisbursmentDetails extends WePayRequest<WePayDisbursementDetails> {

	/** Yes	The unique ID of the disbursement you want to look up. */
	private String disbursementId;

	/** */
	@Override
	public String getEndpoint() {
		return "/disbursement";
	}
}