package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/


import java.util.Collections;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashSet<String> set = new HashSet<>();
        Collections.addAll(set, "арбуз", "банан","вишня","груша","дыня","ежевика","женьшень","земляника","ирис","картофель");
        for (String s:set) {
            System.out.println(s);

        }
    }
}
