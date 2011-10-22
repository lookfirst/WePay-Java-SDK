package com.lookfirst.wepay.api;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * https://stage.wepay.com/developer/reference/account
 *
 * @author Jon Scott Stevens
 */
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class WePayAccountFindResponse extends WePayResponse {

	/** */
	private List<AccountData> accounts;

	/** */
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class AccountData {
		/** The unique ID of the account. */
		private String accountId;
		/** A uri that corresponds to the account's page on WePay. */
		private String accountUri;
	}
}