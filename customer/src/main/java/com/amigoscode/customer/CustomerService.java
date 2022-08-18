package com.amigoscode.customer;

import lombok.AllArgsConstructor;
import  org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private  final RestTemplate restTemplate;
    public void registerCustomer(CustomerRegistrationRequest);
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        // todo: check if email valid
        // todo: check if email not taken
        customerRepository.saveAndFlush(customer);
        // todo: check if fraudster
        FraudCheckResponse fraudCheckResponse = restTemplate.getForObject(
                url:"http:localhoast:8081/api/v1/fraud-check/{customerID}",
                FraudCheckResponse.class,
                customer.getID()

            );

        if (FraudCheckResponse.isFraudster()) {
            throw new IllegalStateException("fraudster");

        customerRepository.save(customer);
        // todo: send notification
    }
}
