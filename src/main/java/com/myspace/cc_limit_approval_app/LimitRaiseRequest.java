package com.myspace.cc_limit_approval_app;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.remote.Remotable
public class LimitRaiseRequest implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Customer ID")
	private java.lang.Long customerId;
	@org.kie.api.definition.type.Label("New limit value suggested by the customer")
	private java.math.BigDecimal requestedValue;
	@org.kie.api.definition.type.Label("Request status")
	private boolean status;
	@org.kie.api.definition.type.Label("Customer current score in the market")
	private java.lang.Long customerScore;

	public LimitRaiseRequest() {
	}

	public java.lang.Long getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(java.lang.Long customerId) {
		this.customerId = customerId;
	}

	public java.math.BigDecimal getRequestedValue() {
		return this.requestedValue;
	}

	public void setRequestedValue(java.math.BigDecimal requestedValue) {
		this.requestedValue = requestedValue;
	}

	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public java.lang.Long getCustomerScore() {
		return this.customerScore;
	}

	public void setCustomerScore(java.lang.Long customerScore) {
		this.customerScore = customerScore;
	}

	public LimitRaiseRequest(java.lang.Long customerId,
			java.math.BigDecimal requestedValue, boolean status,
			java.lang.Long customerScore) {
		this.customerId = customerId;
		this.requestedValue = requestedValue;
		this.status = status;
		this.customerScore = customerScore;
	}

}
