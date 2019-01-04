package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int c1 = 0, c2 = 0, x = 0;
        
        for (int i = 0; i < 3; i++) {
            x = Integer.parseInt(r.readLine());
            if (x > 0) {
                c1++;
            }
            if (x < 0) {
                c2++;
            }
    }
    System.out.println("количество отрицательных чисел: "+c2);
    System.out.println("количество положительных чисел: "+c1);
}
}
