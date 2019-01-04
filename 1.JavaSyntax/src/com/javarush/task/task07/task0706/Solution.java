package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[15];
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < array.length; i++) {
           array[i] = Integer.parseInt(reader.readLine());

           if ((i%2) == 0) {
               sum2 += array[i];
           }
           else sum1 += array[i];
        }
        String s = sum1 > sum2 ? "В домах с нечетными номерами проживает больше жителей.":"В домах с четными номерами проживает больше жителей.";
        System.out.println(s);
    }
}
