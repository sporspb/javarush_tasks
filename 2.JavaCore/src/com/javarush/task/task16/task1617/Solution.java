package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args)  {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        try {
            Thread.sleep(3500);
            clock.interrupt();
        } catch (InterruptedException e) {


        }

    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            while (true) {
                try {


                System.out.print(numSeconds + " ");
                numSeconds--;
                    Thread.sleep(1000);
                if (numSeconds == 0) {
                    System.out.print("Марш!");
                    return;
                }

                } catch (InterruptedException e) {

                    System.out.println("Прервано!");
                    return;
                }
            }
            //add your code here - добавь код тут
        }
    }
}
