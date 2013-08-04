package com.lookfirst.wepay.api.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.AccountId;

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
@EqualsAndHashCode(callSuper=false)
public class AccountDeleteRequest extends WePayRequest<AccountId> {

	/** The unique ID of the account you want to look up. */
	private Long accountId;
	/** Reason for deleting the account. */
	private String reason;

	/** */
	@Override
	public String getEndpoint() {
		return "/account/delete";
	}
}