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
 */
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class WePayTransferRefund extends WePayRequest<WePayTransferRefundResponse> {

	/** Yes	The unique ID of the transfer you want to refund. */
	private String transferId;

	/** */
	public WePayTransferRefund() {
		super(WePayTransferRefundResponse.class);
	}

	/** */
	@Override
	public String getEndpoint() {
		return "/transfer/refund";
	}
}