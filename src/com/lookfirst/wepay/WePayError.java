package com.lookfirst.wepay;

/**
 * Known error codes.  Because wepay might add additional codes, this is not guaranteed to be an exhaustive list.
 */
public enum WePayError {
	invalid_request,
	access_denied,
	invalid_scope,
	invalid_client,
	processing_error;
}
