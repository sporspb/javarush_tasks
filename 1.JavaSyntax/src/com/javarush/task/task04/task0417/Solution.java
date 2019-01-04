package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(r.readLine());
    int b = Integer.parseInt(r.readLine());
    int c = Integer.parseInt(r.readLine());
    
    if ((a == b)&&(b == c)) {
        System.out.print(a+" "+b+" "+c);
    }
    else {   
       
        if (b == c) {
            System.out.print(b+" "+c); 
        }
    
        if (a == b) {
           System.out.print(a+" "+b); 
        }
         
        if (a == c) {
           System.out.print(a+" "+c); 
        }
    
    }
    }
}