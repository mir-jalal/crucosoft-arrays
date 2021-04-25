package com.crucosoft.arrays;

import java.util.Scanner;

public class Sixth {
    // 6. Arraya verilmiş elementi daxil etmək. (Əvəz etmək yoxsa daxil etmək.)
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int length = scan.nextInt();
        int[] array = new int[length];

        for(int i = 0; i<length; i++)
        {
            array[i] = scan.nextInt();
        }

        int oldNumber = scan.nextInt();
        int newNumber = scan.nextInt();

        int place = find(array, oldNumber);

        if(place == -1){
            int[] newArray = new int[length+1];

            System.arraycopy(array, 0, newArray, 0, length);

            newArray[length] = newNumber;
            array = newArray;
        }else{
            array[place] = newNumber;
        }

        Fifth.print(array);
    }

    public static int find(int[] array, int number){
        for(int i = 0; i<array.length; i++){
            if(array[i]==number)
                return i;
        }
        return -1;
    }
}
