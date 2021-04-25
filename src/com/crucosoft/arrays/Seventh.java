package com.crucosoft.arrays;

import java.util.Scanner;

public class Seventh {
    // 6. Arrayda duplicate elementləri silmək.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] array = new int[length];

        for(int i = 0; i<length; i++)
        {
            array[i] = scanner.nextInt();
        }
        Fifth.print(removeDuplicates(array));
    }

    public static int[] removeDuplicates(int[] array){
        for(int i = 0; i<array.length; i++){
            for(int j = i+1; j<array.length; j++){
                if(array[i] == array[j]){
                    array = removeElement(array, j);
                    j--;
                }
            }
        }
        return array;
    }

    public static int[] removeElement(int[] array, int place){
        int[] newArray = new int[array.length-1];
        int j = 0;
        for(int i = 0; i<array.length; i++){
            if(i!=place){
                newArray[j++] = array[i];
            }
        }
        return newArray;
    }
}
