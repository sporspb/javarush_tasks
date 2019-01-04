package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        for (int i = 0; i < 5; i++) {
            strings.add(r.readLine());
            if (strings.get(i).length() > max) {
                max = strings.get(i).length();
            }

        }
        for (int i = 0; i < strings.size() ; i++) {
            if (strings.get(i).length() == max) {

                System.out.println(strings.get(i));
            }

        }
    }

}
