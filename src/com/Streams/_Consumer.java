package com.Streams;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "9999");
        greetCustomer(maria);
        greetCustomerConsumer.accept(maria);
        greetCustomerConsumerv2.accept(maria,false);
    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerv2 = (customer, showPhoneNumber) ->
        System.out.println("Hello " + customer.customerName +
            ", thanks for registering phone number "
            + (showPhoneNumber ? customer.customerPhoneNumber : "*******"));
    static Consumer<Customer> greetCustomerConsumer = customer ->
        System.out.println("Hello " + customer.customerName +
            ", thanks for registering phone number "
            + customer.customerPhoneNumber);
    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName +
            ", thanks for registering phone number "
            + customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
