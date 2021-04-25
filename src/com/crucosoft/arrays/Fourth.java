package com.crucosoft.arrays;

import java.util.Scanner;

public class Fourth {
    // 4. Arrayda verilmiş elementin olub olmadığını yoxlamaq.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];

        for(int i = 0; i<length; i++)
        {
            arr[i] = scanner.nextInt();
        }

        int searched = scanner.nextInt();

        for(int i = 0; i<length; i++)
        {
            if(arr[i] == searched) {
                System.out.println("Found at: " + (i+1));
                return;
            }
        }
        System.out.println("Can't find");
    }
}
