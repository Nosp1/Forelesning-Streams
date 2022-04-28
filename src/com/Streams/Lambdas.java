package com.Streams;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
        Function<String, String> upperCaseName = name -> {
            if (name.isBlank()) throw new IllegalArgumentException("");
            return name.toUpperCase();
        };
        BiFunction<String, Integer,String> uppercaseNameBi = (name, age) -> {
           if (name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase().concat(" " + age);
        };
       String x = uppercaseNameBi.apply("John",15);
        System.out.println("x = " + x);
        
    }
}
