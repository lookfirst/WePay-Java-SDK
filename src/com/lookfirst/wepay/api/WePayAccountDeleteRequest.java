package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * https://stage.wepay.com/developer/reference/account
 *
 * Deletes the account specified. The use associated with the access token used must have permission to delete the account.
 * An account may not be deleted if it has a balance, pending bills, pending payments, or has ordered a debit card.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class WePayAccountDeleteRequest extends WePayRequest<WePayAccountId> {

	/** The unique ID of the account you want to look up. */
	private String accountId;

	/** */
	@Override
	public String getEndpoint() {
		return "/account/delete";
	}
}