package com.example.contractsdemo

import com.example.contractsdemo.model.FraudCheck
import com.example.contractsdemo.model.FraudCheckResult
import com.example.contractsdemo.model.FraudCheckStatus

import org.springframework.stereotype.Service

@Service
class FraudDetectionService {

	static final String NO_REASON = null
	static final String AMOUNT_TOO_HIGH = 'Amount too high'
	static final BigDecimal MAX_AMOUNT = 5000

	FraudCheckResult verify(FraudCheck fraudCheck) {
		if (amountGreaterThanThreshold(fraudCheck)) {
			return new FraudCheckResult(FraudCheckStatus.FRAUD, AMOUNT_TOO_HIGH)
		}
		return new FraudCheckResult(FraudCheckStatus.OK, NO_REASON)
	}

	boolean amountGreaterThanThreshold(FraudCheck fraudCheck) {
		return (MAX_AMOUNT <=> fraudCheck.getLoanAmount()) < 0
	}
}
