package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

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
 */
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class WePayCheckoutCreate extends WePayRequest<WePayCheckoutCreateResponse> {

	public static final String MODE_IFRAME = "iframe";
	public static final String MODE_REGULAR = "regular";

	public static final String TYPE_GOODS = "GOODS";
	public static final String TYPE_SERVICE = "SERVICE";
	public static final String TYPE_DONATION = "DONATION";
	public static final String TYPE_PERSONAL = "PERSONAL";

	public static final String PAYER = "Payer";
	public static final String PAYEE = "Payee";

	/** The unique ID of the account you want to create a checkout for. */
	private String accountId;
	/** A short description of what is being paid for. */
	private String shortDescription;
	/** A long description of what is being paid for. */
	private String longDescription;
	/** A short message that will be included in the payment confirmation email. */
	private String emailMessage;
	/** The the checkout type (one of the following: GOODS, SERVICE, DONATION, or PERSONAL) */
	private String type;
	/** The unique reference id of the checkout (set by the application in /checkout/create */
	private String referenceId;
	/** The amount that the payer will pay. */
	private String amount;
	/** The amount that the application will receive in fees. App fees go into the API applications WePay account. */
	private String appFee;
	/** Who will pay the fees (WePay's fees and any app fees). Set to "Payer" to charge fees to the person paying (Payer will pay amount + fees, payee will receive amount). Set to "Payee" to charge fees to the person receiving money (Payer will pay amount, Payee will receive amount - fees). Defaults to "Payer". */
	private String feePayer;
	/** The uri the payer will be redirected to after paying. */
	private String redirectUri;
	/** The uri that will receive any Instant Payment Notifications sent. Needs to be a full uri (ex https://www.wepay.com ) */
	private String callbackUri;
	/** A boolean value (0 or 1). Default is 1. If set to 0 then the payment will not automatically be released to the account and will be held by WePay in payment state 'reserved'. To release funds to the account you must call /checkout/capture */
	private boolean autoCapture;
	/** A boolean value (0 or 1). If set to 1 then the payer will be asked to enter a shipping address when they pay. After payment you can retrieve this shipping address by calling /checkout */
	private boolean requireShipping;
	/** The amount that you want to charge for shipping. */
	private String shippingFee;
	/** A boolean value (0 or 1). If set to 1 and the account has a relevant tax entry (see /account/set_tax), then tax will be charged. */
	private boolean chargeTax;
	/** What mode the checkout will be displayed in. The options are 'iframe' or 'regular'. Choose 'iframe' if this is an iframe checkout. Mode defaults to 'regular'. */
	private String mode;
	/** The ID of a preapproval object. If you include a valid preapproval_id the checkout will be executed immediately, and the payer will be charged without having to go to the checkout_uri. You should not have to send the payer to the checkout_uri.  */
	private String preapprovalId;

	/** */
	public WePayCheckoutCreate() {
		super(WePayCheckoutCreateResponse.class);
	}

	/** */
	@Override
	public String getEndpoint() {
		return "/checkout/create";
	}
}