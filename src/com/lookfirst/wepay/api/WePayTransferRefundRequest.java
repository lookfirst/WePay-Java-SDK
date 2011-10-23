package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * https://stage.wepay.com/developer/reference/disbursement
 *
 * This call allows you to refund a transfer.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class WePayTransferRefundRequest extends WePayRequest<WePayTransferState> {

	/** Yes	The unique ID of the transfer you want to refund. */
	private String transferId;

	/** */
	@Override
	public String getEndpoint() {
		return "/transfer/refund";
	}
}