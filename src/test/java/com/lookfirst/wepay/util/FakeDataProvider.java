package com.lookfirst.wepay.util;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Helper class for faking data responses from the server.
 */
@AllArgsConstructor
public class FakeDataProvider implements DataProvider {
	@NonNull
	final String data;

	@Override
	public InputStream getData(String uri, String postJson, String token) throws IOException {
		return new ByteArrayInputStream(data.getBytes());
	}
}
