package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        Double t = Double.parseDouble(r.readLine());
        Double s = t % 5;
        if ((s >= 0) && (s <3)) {
            System.out.println("зелёный");
        }
        if ((s >= 3) && (s <4)) {
            System.out.println("жёлтый");
        }
        if ((s >= 4) && (s <5)) {
            System.out.println("красный");
    }
}
}