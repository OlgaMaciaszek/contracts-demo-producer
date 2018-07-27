package com.example.contractsdemo

import com.example.contractsdemo.model.FraudCheck
import com.example.contractsdemo.model.FraudCheckResult

import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class FraudDetectionController {

	final FraudDetectionService fraudDetectionService

	FraudDetectionController(FraudDetectionService fraudDetectionService) {
		this.fraudDetectionService = fraudDetectionService
	}

	@PutMapping(
			value = "/fraudcheck",
			consumes = 'application/vnd.fraud.v1+json',
			produces = 'application/vnd.fraud.v1+json')
	FraudCheckResult fraudCheck(@RequestBody FraudCheck fraudCheck) {
		return fraudDetectionService.verify(fraudCheck)
	}


}