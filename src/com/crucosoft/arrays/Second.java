package com.crucosoft.arrays;

import java.util.Scanner;

public class Second {
    // 2. İki ölçülü massivin elementləri cədvəl şəklində çap etmək.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int width = scanner.nextInt();

        int[][] arr = new int[height][width];

        for(int i = 0; i < height; ++i){
            for (int j = 0; j < width; j++)
            {
                arr[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < height; ++i){
            for (int j = 0; j < width; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
