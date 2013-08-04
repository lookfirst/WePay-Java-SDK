package com.lookfirst.wepay.api.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.AddBank;
import com.lookfirst.wepay.api.Constants.Mode;

/**
 * https://stage.wepay.com/developer/reference/account
 *
 * This call allows you to add a bank account to a specified account.
 * It will return a URL that a user can visit to add a bank account to their account.
 * In addition, add_bank will allow you to change bank accounts if one was previously set.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class AccountAddBankRequest extends WePayRequest<AddBank> {

	/** The unique ID of the account you want to get the balance of. */
	private Long accountId;
	/** What mode the process will be displayed in. The options are 'iframe' or 'regular'. Choose iframe if you would like to frame the process on your site. Mode defaults to 'regular'. */
	private Mode mode;
	/** The uri the payer will be redirected to after bank account is added. Max 2083 chars. */
	private String redirectUri;

	/** */
	@Override
	public String getEndpoint() {
		return "/account/add_bank";
	}
}