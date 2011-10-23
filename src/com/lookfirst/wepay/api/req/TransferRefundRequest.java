package com.lookfirst.wepay.api.req;

import com.lookfirst.wepay.api.TransferState;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * https://stage.wepay.com/developer/reference/disbursement
 *
 * This call allows you to refund a transfer.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class TransferRefundRequest extends WePayRequest<TransferState> {

	/** Yes	The unique ID of the transfer you want to refund. */
	private String transferId;

	/** */
	@Override
	public String getEndpoint() {
		return "/transfer/refund";
	}
}