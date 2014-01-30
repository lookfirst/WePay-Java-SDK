package com.lookfirst.wepay.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * https://stage.wepay.com/developer/reference/batch
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
public class Calls implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty
	private List<Call> calls;
}