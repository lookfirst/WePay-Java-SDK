package com.lookfirst.wepay.api.req;

import com.lookfirst.wepay.api.Constants.FeePayer;
import com.lookfirst.wepay.api.Constants.Mode;
import com.lookfirst.wepay.api.Constants.PrefillInfo;
import com.lookfirst.wepay.api.Preapproval;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * https://stage.wepay.com/developer/reference/preapproval
 *
 * Creates a new payment preapproval request object for the user associated
 * with the access token used to make this call. If reference_id is passed,
 * it MUST be unique for the application/user pair or an error will be returned.
 *
 * To make the payments execute automatically every month, set auto_recur to true.
 * If you set auto_recur to true, then the first payment will execute at the
 * start_time for that preapproval. If you do not pass a start_time in the
 * /preapproval/create call, then the start_time will default to the time that
 * /preapproval/create was called. The payments will then automatically execute
 * every period after the start_time. So if you set the start_time to January
 * 20th, then the first payment will occur on January 20th, and the next payment
 * will occur on February 20th, and so on.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class PreapprovalCreateRequest extends WePayRequest<Preapproval> {

	/** The WePay account where the money will go when you use this preapproval to execute a payment. */
	private Long accountId;
	/** The amount for the preapproval. The API application can charge up to this amount every period. */
	private BigDecimal amount;
	/** The currency used, default "USD" ("USD" for now). */
	private String currency;
	/** A short description of what the payer is paying for. */
	private String shortDescription;
	/** Can be: hourly, daily, weekly, biweekly, monthly, bimonthly, quarterly, yearly, or once. The API application can charge the payer every period. */
	private String period;
	/** The reference id of the preapproval. Can be any string, but must be unique for the application/user pair. */
	private String referenceId;
	/** The application fee that will go to the API application's account. */
	private BigDecimal appFee;
	/** Who will pay the fees (WePay's fees and any app fees). See web docs for more details. */
	private FeePayer feePayer;
	/** The uri the payer will be redirected to after approving the preapproval. */
	private String redirectUri;
	/** The uri that any instant payment notifications will be sent to. Needs to be a full uri (ex https://www.wepay.com ) and must NOT be localhost or 127.0.0.1 or include wepay.com. Max 2083 chars. */
	private String callbackUri;
	/** The uri that the payer will be redirected to if cookies cannot be set in the iframe; will only work if mode is iframe. */
	private String fallbackUri;
	/** Defaults to false. If set to true then the payer will be require to enter their shipping address when they approve the preapproval. */
	private boolean requireShipping;
	/** The dollar amount of shipping fees that will be charged. */
	private BigDecimal shippingFee;
	/** Defaults to false. If set to true then any applicable taxes will be charged. */
	private boolean chargeTax;
	/** A short message that will be included in the payment confirmation email to the payer. */
	private String payerEmailMessage;
	/** An optional longer description of what the payer is paying for. */
	private String longDescription;
	/** How often per period the API application can charge the payer. */
	private Integer frequency;
	/** When the API application can start charging the payer. Can be a unix_timestamp or a parse-able date-time. */
	private String startTime;
	/** The last time the API application can charge the payer. Can be a unix_timestamp or a parse-able date-time. The default value is five (5) years from the preapproval creation time. Make sure you give your app a bit of wiggle room in case you need to delay charging the customer. */
	private String endTime;
	/** Set to true if you want the payments to automatically execute every period. Useful for subscription use cases. Default value is false. Only the following periods are allowed if you set auto_recur to true: Weekly, Biweekly, Monthly, Quarterly, Yearly */
	private boolean autoRecur;
	/** What mode the preapproval confirmation flow will be displayed in. The options are 'iframe' or 'regular'. Choose 'iframe' if this is an iframe preapproval. Mode defaults to 'regular'. */
	private Mode mode;
	/** A JSON object that lets you pre fill certain fields in the preapproval flow. Allowed fields are 'name', 'email', 'phone_number', 'address', 'city', 'state', 'zip', 'country', 'region', 'postcode'. */
	private PrefillInfo prefillInfo;
	/** What funding sources you want to accept for this checkout. Options are: "bank,cc" to accept both bank and cc payments, "cc" to accept just credit card payments, and "bank" to accept just bank payments. */
	private String fundingSources;
	/** If you are using credit card tokenization use the credit_card_id you received from the /credit_card/create call. */
	private Long paymentMethodId;
	/** Set to 'credit_card' for tokenization. */
	private String paymentMethodType;

	/** */
	@Override
	public String getEndpoint() {
		return "/preapproval";
	}
}