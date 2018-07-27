package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
	request {
		method 'PUT'
		url '/fraudcheck'
		body(
				clientPesel: "12345678902",
				loanAmount: 123.123
		)
		headers {
			header('Content-Type', 'application/vnd.fraud.v1+json;charset=UTF-8')

		}

	}
	response {
		status 200
		body(fraudCheckStatus: "OK",
				rejectionReason: null)
		headers {
			header('Content-Type': 'application/vnd.fraud.v1+json;charset=UTF-8')

		}

	}

}
