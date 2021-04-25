package com.crucosoft.arrays;

import java.util.Scanner;

public class Third {
    // 3. Arrayin ən böyük elementini tapmaq.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        if(length<1){
            return;
        }

        int max = scanner.nextInt();

        for(int i = 1; i<length; i++){
            max = Math.max(scanner.nextInt(), max);
        }

        System.out.println(max);
    }
}
