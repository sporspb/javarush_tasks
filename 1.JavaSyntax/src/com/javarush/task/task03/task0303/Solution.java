package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        double res;
        res = convertEurToUsd(25,0.99);
        System.out.println(res);
        res = convertEurToUsd(27,0.73);
        System.out.println(res);
    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        return eur*course;
    }
}
