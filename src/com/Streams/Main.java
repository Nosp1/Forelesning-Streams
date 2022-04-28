package com.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Trym
 */
public class Main {
    static ArrayList<Integer> tall = new ArrayList<>();
    protected static Random random = new Random();
    static int y = 10;
    ArrayList<String> list = new ArrayList<>();

    public Main() {

    }

    public void addToList(String x) {
        list.add(x);
    }

    public static void main(String[] args) {

    }

            // write your code here
            // es.forEach(System.out::println);

            //Declarative apporach
            //Filter

//        //sort
//           females.forEach(System.out::println);people.forEach(System.out::println);
//        List<Person> sorted = people.stream()
//            .sorted(Comparator.comparing(Person::getAge)) //can use .thenComparing
//            .collect(Collectors.toList());
//
//        sorted.forEach(System.out::println);
//
//        //ALL match
//        boolean match = people.stream()
//            .allMatch(person -> person.getAge() > 5);
//        //any match
//        boolean anyMatch = people.stream()
//            .anyMatch(person -> person.getAge() > 8);
//        //none match
//        boolean noneMatch = people.stream()
//            .noneMatch(person -> person.getName()
//                .equals("Antonio"));
//        //Max
//        people.stream()
//            .max(Comparator.comparing(Person::getAge))
//            .ifPresent(System.out::println);
//        //Min
//        people.stream()
//            .min(Comparator.comparing(Person::getAge))
//            .ifPresent(System.out::println);
//        //group
//        Map<Gender, List<Person>> groups = people.stream()
//            .collect(Collectors.groupingBy(Person::getGender));
//
//        groups.forEach((gender, people1) -> {
//            System.out.println(gender);
//            people1.forEach(System.out::println);
//        });
//
//        //here
//        Optional<String> oldestFemaleAge = people.stream()
//            .filter(person -> person.getGender()
//                .equals(Gender.FEMALE))
//            .max(Comparator.comparing(Person::getAge))
//            .map(Person::getName);
//
//        oldestFemaleAge.ifPresent(System.out::println);

            private static void printAlder(ArrayList<Person> mennesker) {
                for (Person p : mennesker) {
                    System.out.println(p.getAge() < 20 ? p.getName() : p.getGender());

                }
            }

            static List<Person> getPeople() {
                return List.of(
                    new Person("James Bond", 20, Gender.MALE),
                    new Person("George Washington", 30, Gender.MALE),
                    new Person("Alina Smith", 22, Gender.FEMALE),
                    new Person("Helen White", 57, Gender.FEMALE),
                    new Person("Anna Cook", 7, Gender.FEMALE),
                    new Person("Jamie Goa", 23, Gender.MALE),
                    new Person("Zelda Brown", 120, Gender.FEMALE)
                );
            }

            private static Person x(String y, ArrayList<Person> z) {
                return z.stream().filter(p -> p.getName()
                    .equals(y)).findFirst().orElse(null);

            }
        }




