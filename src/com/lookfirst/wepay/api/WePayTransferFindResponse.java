package com.lookfirst.wepay.api;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

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
public class WePayTransferFindResponse extends WePayResponse {

	/** An array of transfer objects (see the /transfer call to see what parameters each transfer object will have). */
	private List<WePayTransfer> transfers;
}