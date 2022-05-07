package org.example.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

public class MVP {

    public void printNames(List<String> names) {
        names.forEach(System.out::println);
    }
    public List<Integer> returnEvenNumbers(List<Integer> numbers) {
        List<Integer>EvenNumbers= numbers.stream().filter(n -> n % 2 == 0).collect(toList());
        return EvenNumbers;
    }
    public int[] doubleInts(int[] numbers) {
        return Arrays.stream(numbers).map(num -> num * 2).toArray();
    }

    /*
        Given a String, return a List<String>, all caps.
     */
    public List<String> splitToAllCapsList(String input) {
        return Arrays.stream(input.split(""))
                .map(str -> str.toUpperCase())
                .collect(Collectors.toList());
    }

    public List<String> filterByFirstLetterAndOrder(List<String> list, String letter) {
        return list.stream().filter(str -> str.substring(0, 1).equals(letter))
                .sorted().map(str -> str.toUpperCase())
                .collect(Collectors.toList());
    }
    public List<String> filterWords(List<String> words, int maxLength, String firstLetter) {
        return words.stream()
                .filter(str -> str.length() < maxLength && str.startsWith(firstLetter))
                .collect(Collectors.toList());
    }
}