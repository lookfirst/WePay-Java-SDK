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
public class WePayTransferState {

	/** Yes	The unique ID of the transfer you refunded. */
	private String transferId;
	/** The state that the refund is in (new, sent, or failed). */
	public String state;
}