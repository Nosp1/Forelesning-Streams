package com.Streams;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {
    protected int x;

    public boolean isEmailValid(String email) {
        return email.contains("@");
    }

    public boolean isPhoneValid(String phone) {
        return phone.startsWith("+0");
    }
    public boolean isAdult(LocalDate dob) {
        return Period.between(dob,LocalDate.now()).getYears() > 16;
    }
  public boolean isValid(Customer customer) {
        return isEmailValid(customer.getEmail()) &&
            isPhoneValid(customer.getPhoneNumber()) &&
            isAdult(customer.getDob());
  }

}
