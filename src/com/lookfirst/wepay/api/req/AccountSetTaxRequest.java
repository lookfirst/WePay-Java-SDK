package com.lookfirst.wepay.api.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.AccountTax;

/**
 * https://stage.wepay.com/developer/reference/account
 *
 * This call lets you set tax rates for an account that will be applied to checkouts created for this account.
 * Taxes are only applied on a checkout if the "charge_tax" parameter is set to true when the checkout is created.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class AccountSetTaxRequest extends WePayRequest<AccountTax> {

	/** The unique ID of the account you want to look up. */
	private String accountId;

	/** An array of tax JSON objects. See below for the format tax objects should take. */
	private String taxes;

	/** */
	@Override
	public String getEndpoint() {
		return "/account/set_tax";
	}
}