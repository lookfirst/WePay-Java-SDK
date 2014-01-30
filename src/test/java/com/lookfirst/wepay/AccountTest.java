package com.lookfirst.wepay;

import com.lookfirst.wepay.api.WePayAccount;
import com.lookfirst.wepay.api.req.AccountFindRequest;
import com.lookfirst.wepay.util.FakeDataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Testing the Account API calls
 */
@Test
public class AccountTest {

	private WePayKey key;

	@BeforeTest
	private void setup() {
		key = new WePayKey(false, 123L, "secret");
	}

	public void testAccountFind() throws Exception {
		String response = "[\n" +
			"{\n" +
			"\"account_id\":12345,\n" +
			"\"name\":\"Example account\",\n" +
			"\"state\":\"active\",\n" +
			"\"description\":\"this account is just an example.\",\n" +
			"\"reference_id\":\"123abc\",\n" +
			"\"type\":\"personal\",\n" +
			"\"create_time\":1367958263,\n" +
			"\"country\": \"US\",\n" +
			"\"currencies\": [\"USD\"],\n" +
			"\"balances\":[\n" +
			"{\n" +
			"\"currency\":\"USD\",\n" +
			"\"balance\":390.50,\n" +
			"\"incoming_pending_amount\":635.30,\n" +
			"\"outgoing_pending_amount\":210.00,\n" +
			"\"reserved_amount\":0,\n" +
			"\"disputed_amount\":0,\n" +
			"\"withdrawal_period\":\"daily\",\n" +
			"\"withdrawal_next_time\":1370112217,\n" +
			"\"withdrawal_bank_name\":\"WellsFargo XXXXX3102\"\n" +
			"}\n" +
			"],\n" +
			"\"statuses\":[\n" +
			"{\n" +
			"\"currency\":\"USD\",\n" +
			"\"incoming_payments_status\":\"ok\",\n" +
			"\"outgoing_payments_status\":\"ok\"\n" +
			"}\n" +
			"],\n" +
			"\"action_reasons\":[]\n" +
			"}\n" +
			"]\n";

		WePayApi api = new WePayApi(key, new FakeDataProvider(response));

		AccountFindRequest find = new AccountFindRequest();
		List<WePayAccount> accounts = api.execute("token", find);
		assert accounts.size() == 1;
		assert accounts.get(0).getAccountId() == 12345L;
		assert accounts.get(0).getBalances().get(0).getIncomingPendingAmount().toString().equals("635.3");
	}
}
