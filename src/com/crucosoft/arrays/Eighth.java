package com.crucosoft.arrays;

import java.util.Scanner;

public class Eighth {
    // 7. Arrayda en çox təkrarlanan elementi tapmaq.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] array = new int[length];

        for(int i = 0; i<length; i++){
            array[i] = scan.nextInt();
        }

        int mostRepeated = 0;
        int maxCtr = 0;

        for(int i = 0; i<length; i++){
            int ctr = 1;
            for(int j = i+1; j<length; j++){
                if(array[i] == array[j]) ctr++;
            }
            if(ctr>maxCtr){
                mostRepeated = array[i];
                maxCtr = ctr;
            }
        }
        System.out.println(mostRepeated);
    }
}
