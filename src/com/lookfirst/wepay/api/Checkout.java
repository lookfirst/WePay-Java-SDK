package com.lookfirst.wepay.api;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * https://stage.wepay.com/developer/reference/checkout
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class Checkout extends CheckoutUri {
	private static final long serialVersionUID = 1L;

	/**
	 * Note that the toString() impls fix jackson serialization problems
	 */
	public static enum State {
		new_ {
			@Override
			public String toString() { return "new"; }
		},
		authorized,
		reserved,
		captured,
		settled,
		cancelled,
		refunded,
		charged_back {
			@Override
			public String toString() { return "charged back"; }
		},
		failed,
		expired
	}

	public static enum FeePayer { payer, payee }

	/** The unique ID of the payment account that the money will go into. */
	private Long accountId;
	/** The state the checkout is in. See the section on IPN for a listing of all states. */
	private State state;
	/** The short description of the checkout. */
	private String shortDescription;
	/** The long description of the checkout (if available). */
	private String longDescription;
	/** The currency used (always USD for now). */
	private String currency;
	/** The dollar amount of the checkout object. This will always be the amount you passed in /checkout/create */
	private BigDecimal amount;
	/** The dollar amount of the WePay fee. */
	private BigDecimal fee;
	/** The total dollar amount paid by the payer. */
	private BigDecimal gross;
	/** The amount that the application received in fees. App fees go into the API application's WePay account. */
	private BigDecimal appFee;
	/** Who is paying the fee (either "payer" for the person paying or "payee" for the person receiving the money). */
	private FeePayer feePayer;
	/** The unique reference_id passed by the application (if available). */
	private String referenceId;
	/** The uri the payer will be redirected to after payment (if available). */
	private String redirectUri;
	/** The uri which Instant Payment Notifications will be sent to. */
	private String callbackUri;
	/** The email address of the person paying (only returned if a payment has been made). */
	private String payerEmail;
	/** The name of the person paying (only returned if a payment has been made). */
	private String payerName;
	/** If the payment was canceled, the reason why. */
	private String cancelReason;
	/** If the payment was refunded the reason why. */
	private String refundReason;
	/** A boolean value. Default is true. If set to true then the payment will not automatically be released to the account and will be held by WePay in payment state 'reserved'. To release funds to the account you must call /checkout/capture */
	private boolean autoCapture;
	/** A boolean value. Default is false. If set to true then the payer will be required to enter their shipping address when paying. */
	private boolean requireShipping;
	/**
	 * If 'require_shipping' was set to true and the payment was made, this will be the shipping address that the payer entered.
	 * It will be in the following format: {"address1":"455 Portage Ave","address2":"Suite B","city":"Palo Alto","state":"CA","zip":"94306","country":"US"}
	 */
	private ShippingAddress shippingAddress;
	/** The dollar amount of taxes paid. */
	private String tax;
	/** If this checkout has been fully or partially refunded, this has the amount that has been refunded so far. */
	private BigDecimal amountRefunded;
	/** The unixtime when the checkout was created. */
	private Long createTime;

	/** */
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@EqualsAndHashCode(callSuper=false)
	public static class ShippingAddress {
		private String address1;
		private String address2;
		private String city;
		private String state;
		private String zip;
		private String country;
	}
}