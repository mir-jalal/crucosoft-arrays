package com.crucosoft.arrays;

import java.util.Scanner;

public class Eleventh {
    // 10. Arrayın əvvəlinə və  ya ortasına hansısa elemənt daxil etmək. (Əvəz etmək yox daxil etmək)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("the place");

        int place = scanner.nextInt();
        System.out.println("the number");
        int newNumber = scanner.nextInt();


        int[] newArray = new int[array.length + 1];

        int t=0;
        for (int i=0;i<length;i++) {
            if (place == t) {
                newArray[t++]=newNumber;
            }
            newArray[t++]=array[i];
        }
        Fifth.print(newArray);
    }
}
