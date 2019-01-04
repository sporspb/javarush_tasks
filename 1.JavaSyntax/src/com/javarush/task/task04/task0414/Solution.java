package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(r.readLine());
        int x = 0;
        
        if ((a % 4) == 0 ) {
            x = 366;
            if (((a % 100) == 0)&&((a % 400) != 0)) {
                x = 365;
            }
            
        }
            else {
                x = 365;
                
            }                  
                  
        System.out.println("количество дней в году: "+x);
    }
}