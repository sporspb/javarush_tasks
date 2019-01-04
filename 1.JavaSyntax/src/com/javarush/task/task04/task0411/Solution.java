package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //напишите тут ваш код

        String s = null;
        if (((month >= 1) && (month <= 2)) | (month == 12)) {
            s = "зима";
        }

        if (((month >= 3) && (month <= 5))) {
            s = "весна";
        }
        if (((month >= 6) && (month <= 8))) {
            s = "лето";
        }
        if (((month >= 9) && (month <= 11))) {
            s = "осень";
        }
        System.out.println(s);
    }
}