package com.lookfirst.wepay.api;

import java.io.Serializable;

import lombok.Data;

/**
 * Defines the basic request for a single transfer.  
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
public class TransferInstruction implements Serializable {
	private static final long serialVersionUID = 1L;

	/** The email address that the money is being sent to. */
	public String to;
	/** The dollar amount on money that is being sent. */
	public String amount;
	/** The reference_id passed by the application (if set). */
	public String referenceId;
}