package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader name = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(name.readLine());
        BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));

        List <Integer> list = new ArrayList<Integer>();

        while(reader.ready()) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        Collections.sort(list);
        list.removeIf(x -> x%2 !=0);
        list.forEach(x -> System.out.println(x));
        name.close();
        reader.close();
        fileInputStream.close();
            



    }
}
