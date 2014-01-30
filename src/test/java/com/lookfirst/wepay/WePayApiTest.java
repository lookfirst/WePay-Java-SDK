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
		assert result.equals("https://stage.wepay.com/v2/oauth2/authorize?client_id=123&redirect_uri=http%3A%2F%2Ftest%2Fredirect&scope=WePayApi.Scope%28scope%3Dmanage_accounts%29%2CWePayApi.Scope%28scope%3Dview_balance%29%2CWePayApi.Scope%28scope%3Dcollect_payments%29%2CWePayApi.Scope%28scope%3Drefund_payments%29%2CWePayApi.Scope%28scope%3Dview_user%29%2CWePayApi.Scope%28scope%3Dpreapprove_payments%29%2CWePayApi.Scope%28scope%3Dsend_money%29&state=state&");
	}

	public void testGetAuthorizationUri2() {
		String result = api.getAuthorizationUri(Scope.getAll(), "http://test/redirect", "state", "userName", "userEmail");
		assert result.equals("https://stage.wepay.com/v2/oauth2/authorize?client_id=123&redirect_uri=http%3A%2F%2Ftest%2Fredirect&scope=WePayApi.Scope%28scope%3Dmanage_accounts%29%2CWePayApi.Scope%28scope%3Dview_balance%29%2CWePayApi.Scope%28scope%3Dcollect_payments%29%2CWePayApi.Scope%28scope%3Drefund_payments%29%2CWePayApi.Scope%28scope%3Dview_user%29%2CWePayApi.Scope%28scope%3Dpreapprove_payments%29%2CWePayApi.Scope%28scope%3Dsend_money%29&state=state&user_name=userName&user_email=userEmail");
	}

}
