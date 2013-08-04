package com.lookfirst.wepay.api.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.AccountTax;

/**
 * https://stage.wepay.com/developer/reference/account
 *
 * This call lets you get the tax rates for an account. They will be in the same format as detailed in the /account/set_tax call.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class AccountGetTaxRequest extends WePayRequest<AccountTax> {

	/** The unique ID of the account you want to look up. */
	private Long accountId;

	/** */
	@Override
	public String getEndpoint() {
		return "/account/get_tax";
	}
}