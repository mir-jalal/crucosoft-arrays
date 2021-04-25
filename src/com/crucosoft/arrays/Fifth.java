package com.crucosoft.arrays;

import java.util.Scanner;

public class Fifth {
    // 5. Arraydan verilmiş element əgər varsa onu silmək.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] array = new int[length];

        for(int i = 0; i<length; i++){
            array[i] = scanner.nextInt();
        }

        int removed = scanner.nextInt();

        while(find(array, removed)){
            int[] newArray = new int[array.length-1];
            int n = 0;
            boolean flag = false;

            for (int j : array) {
                if (j != removed || flag) {
                    newArray[n++] = j;
                }else flag = true;
            }
            array = newArray;
        }

        print(array);
    }

    public static boolean find(int[] array, int number){
        for(int n : array){
            if(n==number)
                return true;
        }
        return false;
    }

    public static void print(int[] array) {
        for(int n : array){
            System.out.print(n + " ");
        }
    }
}
