package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * https://stage.wepay.com/developer/reference/disbursement
 *
 * This call allows you to refund a transfer.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Deprecated
@Data
@EqualsAndHashCode(callSuper=false)
public class TransferState implements Serializable {
	private static final long serialVersionUID = 1L;

	/** Yes	The unique ID of the transfer you refunded. */
	private String transferId;
	/** The state that the refund is in (new, sent, or failed). */
	public String state;
}