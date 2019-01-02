package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;


/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int count = 1;
        int max = 1;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 1; i < arrayList.size(); i++) {

            if (arrayList.get(i).equals(arrayList.get(i-1))) {
                count++;
                if (count > max) {
                    max = count;
                }
            }
            else {
                count = 1;
            }
        }

        System.out.println(max);

    }
}