package com.lookfirst.wepay.api;

import lombok.Data;

public class Constants {
	public static enum SortOrder { ASC, DESC }

	public static enum Mode { iframe, regular }
	public static enum PaymentType { GOODS, SERVICE, DONATION, EVENT, PERSONAL }
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

	public static enum FeePayer { payer, payee, payer_from_app, payee_from_app }

}
