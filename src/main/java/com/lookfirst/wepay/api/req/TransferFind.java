package com.lookfirst.wepay.api.req;

import com.lookfirst.wepay.api.Transfer;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * https://stage.wepay.com/developer/reference/disbursement
 *
 * This call allows you to find transfers associated with an account.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Deprecated
@Data
@EqualsAndHashCode(callSuper=false)
public class TransferFind extends WePayRequest<List<Transfer>> {

	private String accountId;
	private String referenceId;
	private String disbursementId;
	private String state;
	private String to;

	/** */
	@Override
	public String getEndpoint() {
		return "/transfer/find";
	}
}