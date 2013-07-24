package com.lookfirst.wepay.api;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

import com.lookfirst.wepay.api.Checkout.ShippingAddress;
import com.lookfirst.wepay.api.Constants.FeePayer;
import com.lookfirst.wepay.api.Constants.State;

/**
 * This call allows you to lookup the details of a payment preapproval on WePay.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
public class Preapproval implements Serializable {
	private static final long serialVersionUID = 1L;

	/** The unique ID of the preapproval. */
	private Long preapprovalId;
	/** The uri that you send the user to so they can enter their payment info and approve the preapproval. */
	private String preapprovalUri;
	/** A uri that you can send the user to if they need to update their payment method. */
	private String manageUri;
	/** The unique ID of the WePay account where the money will go. */
	private Long accountId;

	/** A short description of what the payer is being charged for. */
	private String shortDescription;
	/** A longer description of what the payer is being charged for (if set). */
	private String longDescription;

	/** The currency that any charges will take place in (for now always USD). */
	private String currency;
	/** The amount in dollars that the application can charge the payer automatically every period. */
	private BigDecimal amount;
	/** Who is paying the fee (either "payer" for the person paying, "payee" for the person receiving the money, "payer_from_app" if payer is paying for app fee and the app is paying WePay fees, or "payee_from_app" if payee is paying for app fee and app is paying for WePay fees). */
	private FeePayer feePayer;
	/** The state that the preapproval is in. See the object states page for the full list. */
	private State state;
	/** The uri that the payer will be redirected to after approving the preapproval. */
	private String redirectUri;
	/** The fee that will go to the API application's account (if set). Limited to 20% of the preapproval amount. */
	private BigDecimal appFee;
	/** How often the API application can execute payments for a payer with this preapproval. Can be: hourly, daily, weekly, biweekly, monthly, bimonthly, quarterly, yearly, and once. Once period is if you only want to get authorization for a future charge and don't need it to be recurring. */
	private String period;
	/** The number of times the API application can execute payments per period. */
	private Integer frequency;
	/** When the API application can begin executing payments with this preapproval. Will be a unix timestamp. */
	private Long startTime;
	/** The last time that the API application can execute a payment with this preapproval. Will be a unix timestamp. */
	private Long endTime;
	/** The reference_id passed by the application (if set). */
	private String referenceId;
	/** The uri which instant payment notifications will be sent to. */
	private String callbackUri;
	/** The shipping address that the payer entered (if applicable). It will be in the following format:

		US Addresses:
		{"address1":"380 Portage Ave","address2":"","city":"Palo Alto","state":"CA","zip":"94306","country":"US"}.

		Non-US Addresses:
		{"address1":"100 Main St","address2":"","city":"Toronto","region":"ON","postcode":"M4E 1Z5","country":"CA"}

		Use ISO 3166-1 codes when specifying the country.
	*/
	private ShippingAddress address;
	/** The amount that was paid in shipping fees (if any). */
	private BigDecimal shippingFee;
	/** The dollar amount of taxes paid (if any). */
	private BigDecimal tax;
	/** Whether or not the preapproval automatically executes the payments every period. */
	private boolean autoRecur;
	/** The name of the payer. */
	private String payerName;
	/** The email of the payer. */
	private String payeeEmail;
	/** The unixtime when the preapproval was created. */
	private Long createTime;
	/** The unixtime of the next scheduled charge +/- 5 minutes (will only show up for approved auto_recur preapprovals). */
	private Long nextDueTime;
	/** The checkout ID of the last successful checkout (state captured) for the preapproval. */
	private Long lastCheckoutId;
	/** The unixtime when the last successful checkout occurred. */
	private Long lastCheckoutTime;
}