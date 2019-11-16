/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coursework.Lambdas.LambdaDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author jearly
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println("BEFORE:");
        myList.forEach(i -> System.out.println(i));  // Consumer lambda prints each value

        Predicate<Integer> pred = i -> i > 7;		// Predicate lambda
        myList.removeIf(pred);					    // Using the predicate

        System.out.println("AFTER:");
        myList.forEach(System.out::println);		// Method reference

    }

}
