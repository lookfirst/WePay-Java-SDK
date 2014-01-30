package com.lookfirst.wepay.api.req;

import com.lookfirst.wepay.api.AccountUri;
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
public class AccountGetUpdateUri extends WePayRequest<AccountUri> {

	/** The unique ID of the account you want to look up. */
	private Long accountId;
	/** What mode the process will be displayed in. The options are 'iframe' or 'regular'. Choose iframe if you would like to frame the process on your site. Mode defaults to 'regular'. */
	private String mode;
	/** The uri the user will be redirected to after completing the process. */
	private String redirectUri;

	/** */
	@Override
	public String getEndpoint() {
		return "/account/get_update_uri";
	}
}