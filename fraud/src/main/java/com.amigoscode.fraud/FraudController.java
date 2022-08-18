package com.amigoscode.fraud;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fraud-check")
@AllArgsConstructor
public class FraudController {

    private FraudCheckService fraudCheckService;

    @GetMapping(path = "{customerID}" )
    public FraudCheckResponse isFraudster(
            @PathVariable("customerID") Integer customerID) {
            boolean isfraudCheckService = fraudCheckService.
                    isFradulentCustomer(customerID);
            return new FraudCheckResponse(isFradulentCustomer);
        }
    }
