package com.lookfirst.wepay.api;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * https://stage.wepay.com/developer/reference/disbursement
 *
 * This call allows you to find transfers associated with an account.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class WePayTransferFind extends WePayRequest<List<WePayTransfer>> {

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