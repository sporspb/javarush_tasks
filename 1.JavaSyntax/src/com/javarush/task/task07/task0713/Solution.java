package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> chisla = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> ostal = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20 ; i++) {
            chisla.add(Integer.parseInt(reader.readLine()));

        }
        for (int i = 0; i < chisla.size(); i++) {
            if (chisla.get(i) % 3 == 0) {
                list1.add(chisla.get(i));
            }
            if (chisla.get(i) % 2 == 0) {
                list2.add(chisla.get(i));
            }if ((chisla.get(i) % 3 != 0) && (chisla.get(i) % 2 != 0)){
                ostal.add(chisla.get(i));
            }


        }
        printList(list1);
        printList(list2);
        printList(ostal);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
