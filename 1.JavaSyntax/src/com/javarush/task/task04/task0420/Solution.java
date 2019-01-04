package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[3];
        int x;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(r.readLine());
        }

        for (int j = 0; j < (array.length - 1); j++) {

            for (int i = 0; i < (array.length - 1); i++) {
                if (array[i + 1] >= array[i]) {
                    x = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = x;
                }
            }
        }
        System.out.print(array[0] + " " + array[1] + " " + array[2]);


    }
}