package com.crucosoft.arrays;

import java.util.Scanner;

public class Tenth {
    // 9. Arrayda en böyük və en kiçik element arasındakı fərqi və cəmi tapmaq.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int max = scanner.nextInt();
        int min = max;

        for(int i = 1; i<length; i++){
            int number = scanner.nextInt();
            if(number>max) max = number;
            if(number<min) min = number;
        }

        System.out.println("Sum: " + (min+max));
        System.out.println("Subtraction: " + (max-min));

    }
}
