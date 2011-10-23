package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

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
@ToString
@EqualsAndHashCode(callSuper=false)
public class WePayAccountSetTax extends WePayRequest<WePayAccountTax> {

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