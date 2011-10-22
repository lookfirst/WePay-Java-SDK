package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import org.codehaus.jackson.annotate.JsonUnwrapped;

/**
 * https://stage.wepay.com/developer/reference/disbursement
 *
 * This call allows you to look up the details of a transfer. A transfer is an object
 * that represents the movement of money from a WePay account to an email address.
 *
 * @author Jon Scott Stevens
 */
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class WePayTransferDetailsResponse extends WePayResponse {

	/** All of the details of the transfer */
	@JsonUnwrapped
	private WePayTransfer transfer;
}