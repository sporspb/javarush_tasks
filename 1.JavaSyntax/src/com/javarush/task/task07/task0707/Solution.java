package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> List = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            List.add("ask");
        }
        System.out.println(List.size());
        for (int i = 0; i < List.size(); i++) {
            System.out.println(List.get(i));

        }
    }
}
