package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * https://stage.wepay.com/developer/reference/disbursement
 *
 * This call allows you to look up the details of a transfer. A transfer is an object that
 * represents the movement of money from a WePay account to an email address.
 *
 * @author Jon Scott Stevens
 */
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class WePayTransferDetails extends WePayRequest<WePayTransferDetailsResponse> {

	/** Yes	The unique ID of the transfer you want to look up. */
	private String transferId;

	/** */
	public WePayTransferDetails() {
		super(WePayTransferDetailsResponse.class);
	}

	/** */
	@Override
	public String getEndpoint() {
		return "/transfer";
	}
}