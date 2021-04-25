package com.crucosoft.arrays;

import java.util.Scanner;

public class Ninth {
    // 8. Verilmiş sözün palindrome olub olmadığını yoxlamaq (Array ilə həlli)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        char[] charArray = text.toCharArray();
        int length = charArray.length;

        for (int i = 0; i < length / 2; i++) {
            if (charArray[i] != charArray[length - i - 1]) {
                System.out.println(text + " is NOT palindrome");
                return;
            }
        }
        System.out.println(text + " is palindrome");
    }
}
