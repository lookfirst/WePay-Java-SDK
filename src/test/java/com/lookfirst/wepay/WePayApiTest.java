package com.lookfirst.wepay;

import com.lookfirst.wepay.WePayApi.Scope;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Testing the api class.
 */
@Test
public class WePayApiTest {

	private WePayApi api;

	@BeforeSuite
	public void setup() {
		WePayKey key = new WePayKey(false, 123L, "secret");
		api = new WePayApi(key);
	}

	public void testGetAuthorizationUri() {
		String result = api.getAuthorizationUri(Scope.getAll(), "http://test/redirect", "state");
		assert result.equals("https://stage.wepay.com/v2/oauth2/authorize?client_id=123&redirect_uri=http%3A%2F%2Ftest%2Fredirect&scope=manage_accounts%2Cview_balance%2Ccollect_payments%2Crefund_payments%2Cview_user%2Cpreapprove_payments%2Csend_money&state=state&");
	}

	public void testGetAuthorizationUri2() {
		String result = api.getAuthorizationUri(Scope.getAll(), "http://test/redirect", "state", "userName", "userEmail");
		assert result.equals("https://stage.wepay.com/v2/oauth2/authorize?client_id=123&redirect_uri=http%3A%2F%2Ftest%2Fredirect&scope=manage_accounts%2Cview_balance%2Ccollect_payments%2Crefund_payments%2Cview_user%2Cpreapprove_payments%2Csend_money&state=state&user_name=userName&user_email=userEmail");
	}

}
