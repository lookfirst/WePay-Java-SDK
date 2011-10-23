package com.lookfirst.wepay.api;

import lombok.Data;

/**
 * Data object used in disbursements and transfers.  This is not actually a Request object
 * like others, it's the instructions for creating a transfer as part of a disbursement.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
public class TransferRequest {
	/** The email address that the money is being sent to. */
	public String to;
	/** The dollar amount on money that is being sent. */
	public String amount;
	/** The reference_id passed by the application (if set). */
	public String referenceId;
}