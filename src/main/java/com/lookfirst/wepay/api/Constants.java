package com.lookfirst.wepay.api;

import lombok.Data;

public class Constants {
	public static enum SortOrder { ASC, DESC }

	public static enum Mode { iframe, regular }
	public static enum PaymentType { GOODS, SERVICE, DONATION, EVENT, PERSONAL }
	public static enum PaymentMethodType { credit_card }
	public static enum WithdrawalType { check, ach }

	@Data
	public static class PrefillInfo {
		String name;
		String email;
		String phoneNumber;
		String address;
		String city;
		String state;
		String zip;
		String country;
		String region;
		String postcode;
	}

	/**
	 * Note that the toString() impls fix jackson serialization problems
	 */
	public static enum State {
		action_required {
			@Override
			public String toString() { return "action required"; }
		},
		active,
		approved,
		authorized,
		available,
		cancelled,
		captured,
		charged_back {
			@Override
			public String toString() { return "charged back"; }
		},
		completed,
		deleted,
		disabled,
		ended,
		expired,
		failed,
		invalid,
		new_ {
			@Override
			public String toString() { return "new"; }
		},
		pending,
		refunded,
		registered,
		reserved,
		retrying,
		revoked,
		settled,
		started,
		stopped,
		transition,
		trial
	}

	public static enum FeePayer { payer, payee, payer_from_app, payee_from_app }

}
