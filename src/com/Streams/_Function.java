package com.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    //Function
    static Function<Integer, Integer> incrementByOneFunction =
        number -> number++;
    static Function<Person, List<Person>> addPerson = person -> {
        List<Person> temp = new ArrayList<>();
        temp.add(person);
        return temp;
    };

    static BiFunction<Integer, Integer, Integer> incrementByOneFunctionAndMultiplyBiFunction =
        (numberToIncrementByOne, numberToMultiplyBy)
            -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    public static void main(String[] args) {
        int increment = increment(0);
        Person person = new Person("John", 22, Gender.MALE);
        int incr = incrementByOneFunction.apply(2);

        List<Person> list = addPerson.apply(person);
        System.out.println(list.size());
        incrementByOneFunctionAndMultiplyBiFunction.apply(2,4);

    }

    static int increment(int number) {
        return number + 1;
    }
}
