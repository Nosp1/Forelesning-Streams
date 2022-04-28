package com.Streams;

import static com.Streams.Main.getPeople;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = getPeople();

        people.stream()
            .map(Person::getGender)
            .collect(Collectors.toSet())
            .forEach(System.out::println);
        people.stream().map(Person::getName)
            .mapToInt(String::length)
            .forEach(System.out::println);
        boolean isFemale = people.stream().allMatch(person -> person.getGender().equals(Gender.FEMALE));
        System.out.println(isFemale);
        boolean anyMatch = people.stream().anyMatch(person -> person.getGender().equals(Gender.FEMALE));
        List<Person> list = Optional.of(getPeople().stream().filter(person
            -> person.getName()
            .contains("ø"))
            .collect(Collectors.toList())
        ).orElseThrow(() -> new IllegalStateException("Failed ot find"));
        System.out.println(list.size());
        list.forEach(System.out::println);
        List<Person> males = getNo_males_in_list(getPeople(),Gender.MALE);
            males.forEach(System.out::println);
        List<Person> female = getNo_males_in_list(getPeople(),Gender.FEMALE);
        female.forEach(System.out::println);
        List<Person> NumFemales = getNo_males_in_list(males,Gender.FEMALE);
        NumFemales.forEach(System.out::println);
    }

    private static List<Person> getNo_males_in_list(List<Person> list, Gender gender) {
        return Optional.of(
           list
                .stream()
                .filter(
                    person -> person
                        .getGender()
                        .equals(gender)
                ).collect(Collectors.toList()))
            .orElseThrow(() -> new IllegalStateException("No males in list"));
    }

}
