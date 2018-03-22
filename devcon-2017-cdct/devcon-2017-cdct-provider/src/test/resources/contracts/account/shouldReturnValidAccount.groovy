package contracts.account

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        urlPath $(consumer(regex('/accounts/[0-9]{10}')), producer(value('/accounts/1234567890')))
    }
    response {
        status 200
        body([
                userId: '1234567890',
                name: "Chuck",
                surname: "Norris"
        ])
        headers {
            contentType(applicationJson())
        }
    }
}