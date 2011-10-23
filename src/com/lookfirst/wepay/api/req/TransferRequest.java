package com.lookfirst.wepay.api.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.Transfer;

/**
 * https://stage.wepay.com/developer/reference/disbursement
 *
 * This call allows you to look up the details of a transfer. A transfer is an object that
 * represents the movement of money from a WePay account to an email address.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class TransferRequest extends WePayRequest<Transfer> {

	/** Yes	The unique ID of the transfer you want to look up. */
	private String transferId;

	/** */
	@Override
	public String getEndpoint() {
		return "/transfer";
	}
}