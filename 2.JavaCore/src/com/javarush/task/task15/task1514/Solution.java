package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(3.2,"Hjkj");
        labels.put(3.4,"dgfg");
        labels.put(7.2,"Hjkdgfgj");
        labels.put(56.2,"Hjgkj");
        labels.put(2.2,"Hjssskj");

    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
