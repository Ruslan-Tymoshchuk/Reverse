package com.rtim.reverse;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        String reversedText = reverseText(inputText);
        Long timeOfThousand = countTime(inputText, 1000);
        Long timeOfTenThousand = countTime(inputText, 10000);
        Long timeOfHundredThousand = countTime(inputText, 100000);
        System.out.println(String.format("%s %s %d %d %d", inputText, reversedText, timeOfThousand, timeOfTenThousand,
                timeOfHundredThousand));
        scanner.close();
    }

    private static String reverseText(String inputText) {
        StringBuilder text = new StringBuilder(inputText);
        return text.reverse().toString();
    }

    private static long countTime(String inputText, int times) {
        long startTime = System.nanoTime();
        for (int i = 0; i < times; i++) {
            reverseText(inputText);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}