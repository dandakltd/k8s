package com.amigoscode.fraud;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudCheckService  {

    private final FraudCheckHistoryRepo FraudCheckHistoryRepo;

    public boolean isFradulentCustomer(Integer customerID) {
        FraudCheckHistoryRepo.save(
                FraudCheckHistory.builder()
                        .customerId(customerID)
                        .isFraudster(false)
                        .createdAt(LocalDateTime.now().now())
                        .build()
        );
        return false;
    }
}
