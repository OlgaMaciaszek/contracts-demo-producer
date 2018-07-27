package com.example.contractsdemo

import io.restassured.module.mockmvc.RestAssuredMockMvc
import spock.lang.Specification

class FraudCheckTestBaseClass extends Specification {

	def setup() {
		RestAssuredMockMvc.standaloneSetup(new FraudDetectionController(new FraudDetectionService()))
	}
}
