package com.lookfirst.wepay.api.req;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.Withdrawal;
import com.lookfirst.wepay.api.Constants.SortOrder;

/**
 * https://stage.wepay.com/developer/reference/withdrawal
 *
 * This call allows you to find withdrawals.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class WithdrawalFindRequest extends WePayRequest<List<Withdrawal>> {

	/** The unique ID of the account you want to look up withdrawals for. */
	private String accountId;
	/** The maximum number of withdrawals that will be returned. */
	private Integer limit;
	/** If more than "limit" withdrawals are found, where to start in the withdrawal list. */
	private Integer start;
	/** Sort the results of the search by time created. Use 'DESC' for most recent to least recent. Use 'ASC' for least recent to most recent. Defaults to 'DESC'. */
	private SortOrder sortOrder;

	/** */
	@Override
	public String getEndpoint() {
		return "/withdrawal/find";
	}
}