package com.lookfirst.wepay.util;

import java.io.IOException;
import java.io.InputStream;

/**
 * Setup so that we can unit test things more easily.
 */
public interface DataProvider {
	InputStream getData(String uri, String postJson, String token) throws IOException;
}
