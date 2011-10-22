package com.lookfirst.wepay.api;

import org.codehaus.jackson.annotate.JsonUnwrapped;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * https://stage.wepay.com/developer/reference/disbursement
 *
 * This call allows you to find transfers associated with an account.
 *
 * @author Jon Scott Stevens
 */
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class WePayTransferFind extends WePayRequest<WePayTransferFindResponse> {

	/** All of the details of the transfer */
	@JsonUnwrapped
	private WePayTransfer transfer;

	/** */
	public WePayTransferFind() {
		super(WePayTransferFindResponse.class);
	}

	/** */
	@Override
	public String getEndpoint() {
		return "/transfer/find";
	}
}