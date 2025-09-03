package org.example;

import java.util.Arrays;

public class Utils {

    public static int[] findAllEvenNumbers(int[] numbers) {

        return Arrays.stream(numbers)
                .filter(num -> num % 2 == 0)  // 过滤条件：偶数
                .toArray();
    }

    public static int findLargestNumber(int[] numbers) {
        int largest = numbers[0];
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }
        return largest;
    }

    public static boolean isTrue(int number) {
        return number > 10;
    }
}
