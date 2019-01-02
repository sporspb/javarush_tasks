package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        int maximum = 0;

        for (int i = 1; i <= count; i++) {
            int x = Integer.parseInt(reader.readLine());
            if (x > maximum) {
                maximum = x;
            }

        }

        //напишите тут ваш код

        System.out.println(maximum);
    }
}
