package com.example.contractsdemo.model

import groovy.transform.Canonical

@Canonical
class FraudCheck {

	String clientId
	BigDecimal loanAmount
}