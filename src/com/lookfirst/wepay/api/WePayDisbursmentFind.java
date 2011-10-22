package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * https://stage.wepay.com/developer/reference/disbursement
 *
 * This call allows you to find disbursements.
 *
 * @author Jon Scott Stevens
 */
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class WePayDisbursmentFind extends WePayRequest<WePayDisbursementFindResponse> {

	/** Yes	The unique ID of the account you want to look up disbursements for. */
	private String accountId;
	/** No	The reference_id on the disbursement object (set in /disbursement/create). */
	private String referenceId;
	/** No	The state the disbursement is in (new, sent, or failed). */
	private String state;

	/** */
	public WePayDisbursmentFind() {
		super(WePayDisbursementFindResponse.class);
	}

	/** */
	@Override
	public String getEndpoint() {
		return "/disbursement/find";
	}
}