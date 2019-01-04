package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(r.readLine());
        
        if (x == 0) {
            
            System.out.println("ноль");
        }
        
        else {
        
        if (x > 0) {
            
            System.out.print("положительное");
        }
        
        if (x < 0) {
            
            System.out.print("отрицательное");
        }
        
        if ((x % 2) == 0) {
            
            System.out.print(" четное число");
        }
        else {
            System.out.print(" нечетное число");
        }
        }
    }
}
