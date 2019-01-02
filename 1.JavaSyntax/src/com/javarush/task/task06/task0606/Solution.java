package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int a = Integer.parseInt(input);
        for (int i = 0; i < input.length(); i++) {

                if (a % 2 == 0) {
                even++; }
                else {
                    odd++;
                }
            a /= 10;
            }
        System.out.print("Even: " + even + " Odd: " + odd);


    }
}
