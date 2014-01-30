package com.lookfirst.wepay.api.req;

import com.lookfirst.wepay.api.AccountReserve;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * https://stage.wepay.com/developer/reference/account
 *
 * This call allows you to add or update all incomplete items for an account like KYC info, bank account, etc. It will return a URL that a user can visit to update info for his or her account.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class AccountGetReserveDetails extends WePayRequest<AccountReserve> {

	/** The unique ID of the account you want to look up. */
	private Long accountId;
	/** The currency for the reserves. Defaults to "USD". */
	private String currency;

	/** */
	@Override
	public String getEndpoint() {
		return "/account/get_reserve_details";
	}
}