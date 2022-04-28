package com.Streams;

import static com.Streams.CustomerRegistrationValidator.ValidationResult;
import static com.Streams.CustomerRegistrationValidator.isAnAdult;
import static com.Streams.CustomerRegistrationValidator.isEmailValid;
import static com.Streams.CustomerRegistrationValidator.isPhoneNumberValid;

import java.time.LocalDate;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer = new Customer(
            "Alin",
            "alin@gmail.com",
            "8989898989",
            LocalDate.of(2000, 12, 21)
        );
        CustomerValidatorService validatorService = new CustomerValidatorService();
        validatorService.isValid(customer);

        //combinator pattern
        ValidationResult result = isEmailValid()
            .and(isPhoneNumberValid())
            .and(isAnAdult())
            .apply(customer);
        System.out.println(result);

        if (result != ValidationResult.SUCCESS) {
            throw new IllegalArgumentException(result.name());
        }
    }
}
