package org.example;

import static org.example.Utils.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 9, 5, 6, 7, 5, 9, 10};
        boolean aTrue = isTrue(findLargestNumber(findAllEvenNumbers(numbers)));
        System.out.printf(aTrue + "");
    }
}