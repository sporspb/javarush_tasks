package com.javarush.task.task16.task1623;

/* 
Рекурсивное создание нитей
*/



public class Solution {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread{
        public GenerateThread() {
            super(String.valueOf(++createdThreadCount));


            start();
            try {
                join();
            } catch (InterruptedException e) {
                //e.printStackTrace();
            }


        }

        @Override
        public void run() {
            if (createdThreadCount < Solution.count) {
                try {
                    Thread t = new GenerateThread();
                    t.join();
                    System.out.println(t.toString());
                } catch (InterruptedException e) {
                   // e.printStackTrace();
                }
            }
        }

        @Override
        public String toString() {
            return (getName() + " created");
        }
    }


}
