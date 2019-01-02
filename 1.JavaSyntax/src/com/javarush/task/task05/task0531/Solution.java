package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {
    public static int min(int a,int b,int c,int d, int f){
        int min = 0;
        if ((a <= b)&&(a<=c)&&(a<=d)&&(a<=f)) {
                min = a; }
        else if ((b <= a)&&(b<=c)&&(b<=d)&&(b<=f)) {
            min = b;
                }
                    else if ((c <= b)&&(c<=a)&&(c<=d)&&(c<=f)) {
            min = c; }
            else if ((d <= b)&&(d<=c)&&(d<=a)&&(d<=f)) {
            min = d; }
            else if ((f <= b)&&(f<=c)&&(f<=d)&&(f<=a)) {
            min = f;


            }

        return min;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int f = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, f);

        System.out.println("Minimum = " + minimum);
    }


   public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
