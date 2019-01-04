package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] big = new int[20];
        int[] first = new int[10];
        int[] second = new int[10];
        for (int i = 0; i < big.length; i++) {
            big[i] = Integer.parseInt(reader.readLine());

        }
        for (int i = 0; i < first.length; i++) {
            first[i] = big[i];
             }

        for (int i = 0; i < second.length; i++) {
            int j = i +big.length/2;
            second[i] = big[j];
            System.out.println(second[i]);

        }    }
}
