package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Data object used in disbursements and transfers
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class Transfer extends TransferRequest {
	/** The unique ID of the transfer. */
	public String transferId;
	/** The unique ID of the account the money is coming from. */
	public String accountId;
	/** No	The unique ID of the disbursement you want to look up transfers for. */
	public String disbursementId;
	/** The state that the disbursement is in (new, sent, or failed). */
	public String state;
}