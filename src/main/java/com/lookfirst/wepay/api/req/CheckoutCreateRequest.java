package com.lookfirst.wepay.api.req;

import com.lookfirst.wepay.api.CheckoutUri;
import com.lookfirst.wepay.api.Constants.FeePayer;
import com.lookfirst.wepay.api.Constants.Mode;
import com.lookfirst.wepay.api.Constants.PaymentType;
import com.lookfirst.wepay.api.Constants.PrefillInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * https://stage.wepay.com/developer/reference/checkout
 *
 * Creates a checkout for an account. The application can send a user to the checkout_uri so the user can pay the account for the amount specified.
 * NOTE: Checkouts will be expired 30 minutes after they are created if their is no activity on them (ie they were abandoned after creation).
 *
 * When the payer completes the payment, they will be returned to the redirect_uri you used in the /checkout/create call.
 * The checkout_id and the payment authorization code will be uri encoded in the redirect_uri so that you can confirm that the payment was made.
 * You can also use the Instant Payment Notifications system to receive push notifications of checkout state changes.
 * If you did not specify a redirect_uri, they will be returned to the application homepage.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class CheckoutCreateRequest extends WePayRequest<CheckoutUri> {

	/** The unique ID of the account you want to create a checkout for. */
	private Long accountId;
	/** A short description of what is being paid for. */
	private String shortDescription;
	/** A long description of what is being paid for. */
	private String longDescription;

	/** A short message that will be included in the payment confirmation email to the payer. */
	private String payerEmailMessage;
	/** A short message that will be included in the payment confirmation email to the payee. */
	private String payeeEmailMessage;

	/** Required. The the checkout type (one of the following: GOODS, SERVICE, DONATION, or PERSONAL) */
	private PaymentType type;
	/** The unique reference id of the checkout (set by the application in /checkout/create */
	private String referenceId;
	/** The amount that the payer will pay. */
	private BigDecimal amount;
	/** The currency used, default "USD" ("USD" for now). */
	private String currency;
	/** The amount that the application will receive in fees. App fees go into the API applications WePay account. */
	private BigDecimal appFee;
	/** Who will pay the fees (WePay's fees and any app fees). Set to "Payer" to charge fees to the person paying (Payer will pay amount + fees, payee will receive amount). Set to "Payee" to charge fees to the person receiving money (Payer will pay amount, Payee will receive amount - fees). Defaults to "Payer". */
	private FeePayer feePayer;
	/** The uri the payer will be redirected to after paying. */
	private String redirectUri;
	/** The uri that will receive any Instant Payment Notifications sent. Needs to be a full uri (ex https://www.wepay.com ) */
	private String callbackUri;
	/** The uri that the payer will be redirected to if cookies cannot be set in the iframe; will only work if mode is iframe. */
	private String fallbackUri;
	/** A boolean value (0 or 1). Default is 1. If set to 0 then the payment will not automatically be released to the account and will be held by WePay in payment state 'reserved'. To release funds to the account you must call /checkout/capture */
	private boolean autoCapture;
	/** A boolean value (0 or 1). If set to 1 then the payer will be asked to enter a shipping address when they pay. After payment you can retrieve this shipping address by calling /checkout */
	private boolean requireShipping;
	/** The amount that you want to charge for shipping. */
	private BigDecimal shippingFee;
	/** A boolean value (0 or 1). If set to 1 and the account has a relevant tax entry (see /account/set_tax), then tax will be charged. */
	private boolean chargeTax;
	/** What mode the checkout will be displayed in. The options are 'iframe' or 'regular'. Choose 'iframe' if this is an iframe checkout. Mode defaults to 'regular'. */
	private Mode mode;
	/** The ID of a preapproval object. If you include a valid preapproval_id the checkout will be executed immediately, and the payer will be charged without having to go to the checkout_uri. You should not have to send the payer to the checkout_uri.  */
	private Long preapprovalId;
	/** A JSON object that lets you pre fill certain fields in the checkout. Allowed fields are 'name', 'email', 'phone_number', 'address', 'city', 'state', 'zip', Pass the prefill-info as a JSON object like so: {"name":"Bill Clerico","phone_number":"855-469-3729"} */
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
		return "/checkout/create";
	}
}