package com.javarush.task.task12.task1229;

/* 
Родитель класса CTO
*/

public class Solution {



    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public interface Businessman {
        void workHard();
    }

    public static class CTO extends Test implements Businessman{

    }

    public static class Test {
        public void workHard(){}
    }
}
