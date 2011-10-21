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
 */
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class WePayAccountDelete extends WePayRequest<WePayAccountDeleteResponse> {

	/** The unique ID of the account you want to look up. */
	private String accountId;

	/** */
	public WePayAccountDelete() {
		super(WePayAccountDeleteResponse.class);
	}

	/** */
	@Override
	public String getEndpoint() {
		return "/account/delete";
	}
}