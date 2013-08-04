package com.lookfirst.wepay;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Holds the keys. Needs to be passed into the WePayApi.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WePayKey implements Serializable {

	private static final long serialVersionUID = 1L;

	public boolean production;
	public Long clientId;
	public String clientSecret;
}
