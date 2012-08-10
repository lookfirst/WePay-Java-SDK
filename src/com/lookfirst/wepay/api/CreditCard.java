package com.lookfirst.wepay.api;

import java.io.Serializable;

import lombok.Data;

/**
 * Data object used in credit_card api calls
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
public class CreditCard implements Serializable {
	private static final long serialVersionUID = 1L;

	/** The unique ID of the credit_card. */
	public String creditCardId;
	/** The string that identifies the credit_card such as MasterCard xxxxxx4769. */
	public String creditCardName;
	/** The state that the credit card is in. */
	public String state;
	/** The name on the card (ie "Bob Smith"). */
	public String userName;
	/** The email address of the user who owns the card. */
	public String email;
	/** The unique reference ID of the account (this is set by the application in the /account/create or /account/modify call). */
	public String referenceId;
}