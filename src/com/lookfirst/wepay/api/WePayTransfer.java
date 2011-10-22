package com.lookfirst.wepay.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Data object used in disbursements and transfers
 *
 * @author Jon Scott Stevens
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WePayTransfer {
	/** The unique ID of the transfer. */
	public String transferId;
	/** The reference_id passed by the application (if set). */
	public String referenceId;
	/** The unique ID of the account the money is coming from. */
	public String accountId;
	/** No	The unique ID of the disbursement you want to look up transfers for. */
	public String disbursementId;
	/** The email address that the money is being sent to. */
	public String to;
	/** The state that the disbursement is in (new, sent, or failed). */
	public String state;
	/** The dollar amount on money that is being sent. */
	public String amount;
}