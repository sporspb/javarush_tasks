package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        String [] words = s.split(" +");
        ArrayList<String> listwords = new ArrayList<String>(Arrays.asList(words));

        for (int i = 0; i < listwords.size(); i++) {
            StringBuffer sb = new StringBuffer(listwords.get(i));

            char first = Character.toUpperCase(sb.charAt(0));
            sb.setCharAt(0,first);
            listwords.set(i,sb.toString());

        }
        for (int i = 0; i < listwords.size(); i++) {
            System.out.print(listwords.get(i)+" ");

        }

        //listwords.forEach(s1 -> System.out.print(s1+" "));
        //напишите тут ваш код
    }
}
