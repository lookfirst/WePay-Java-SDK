package com.lookfirst.wepay;

import com.lookfirst.wepay.api.Call;
import com.lookfirst.wepay.api.Calls;
import com.lookfirst.wepay.api.req.BatchCreateRequest;
import com.lookfirst.wepay.util.FakeDataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Testing the /batch api
 */
@Test
public class BatchTest {
	private WePayKey key;

	@BeforeTest
	private void setup() {
		key = new WePayKey(false, 123L, "secret");
	}

	public void testBatch() throws Exception {
		String response = "{\n" +
				"   \"calls\": [\n" +
				"       {\n" +
				"         \"call\":\"/user\",\n" +
				"         \"reference_id\":\"1341351\",\n" +
				"         \"response\":{\n" +
				"            \"user_id\":54312,\n" +
				"            \"email\":\"test@example.com\",\n" +
				"            \"first_name\":\"bob\",\n" +
				"            \"last_name\":\"smith\"\n" +
				"         }\n" +
				"      },\n" +
				"      {\n" +
				"         \"call\":\"/checkout/create\",\n" +
				"         \"reference_id\":\"23535111\",\n" +
				"         \"response\":{\n" +
				"            \"error\":\"access_denied\",\n" +
				"            \"error_description\":\"this account can no longer transact\",\n" +
				"            \"error_code\":3004\n" +
				"         }\n" +
				"      }\n" +
				"   ]\n" +
				"}";

		WePayApi api = new WePayApi(key, new FakeDataProvider(response));
		BatchCreateRequest batch = new BatchCreateRequest();
		Calls calls = api.execute("token", batch);
		List<Call> callList = calls.getCalls();
		assert callList.size() == 2;
		assert callList.get(0).getCall().equals("/user");
		assert callList.get(1).getCall().equals("/checkout/create");
	}
}
