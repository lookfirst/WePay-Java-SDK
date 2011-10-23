package com.lookfirst.wepay.api.req;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.Disbursement;
import com.lookfirst.wepay.api.TransferInstruction;

/**
 * https://stage.wepay.com/developer/reference/disbursement
 *
 * This call allows you to create a disbursement object. A disbursement is a collection
 * of monetary transfers from a WePay account to an email address. So if you want to
 * send money from a WePay account to between 1 and 1000 emails, use this call.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class DisbursementCreateRequest extends WePayRequest<Disbursement> {

	/** Yes	The unique ID of the account you want to look up disbursements for. */
	private String accountId;
	/** No	The reference_id on the disbursement object (set in /disbursement/create). */
	private String referenceId;
	/** No	The state the disbursement is in (new, sent, or failed). */
	private String state;
	/** The uri that the account owner will be sent to after they authorize the disbursement. Defaults to the application homepage. */
	private String redirectUri;
	/**
	 * An array of transfer objects (see the disbursement tutorial for an example). Each transfer object has the following:
	 * to: Email that the money will be sent to.
	 * amount: Dollar amount to send to the email.
	 * reference_id: (optional) id to track the transfer.
	 */
	private List<TransferInstruction> transfers;

	/** */
	@Override
	public String getEndpoint() {
		return "/disbursement/create";
	}
}