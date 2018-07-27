package com.example.contractsdemo.model

import groovy.transform.Canonical

@Canonical
class FraudCheckResult {

	FraudCheckStatus fraudCheckStatus
	String rejectionReason
}
