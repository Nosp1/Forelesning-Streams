package com.Streams;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        //System.out.println(isPhoneNumberValid("07000000000"));
        //System.out.println(isPhoneNumberValid("0700000000"));
        //System.out.println(isPhoneNumberValid("09009877300"));
 //       System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.and(constainsNumber3).test("09009877300"));

    }
    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
                 phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> constainsNumber3 = phoneNumber ->
        phoneNumber.contains("3");
}
