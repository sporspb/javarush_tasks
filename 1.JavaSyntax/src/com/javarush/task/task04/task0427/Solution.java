package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(r.readLine());
        
        if ((x > 0) && (x <1000)) {
            
            if ((x % 2) == 0 ) {
                System.out.print("четное");
            }
                else {
                System.out.print("нечетное");
                }
                
                
                
                if (x > 99) {
                    
                    System.out.print(" трехзначное число");
                    
                }
                
                else {
                if (x < 10) {
                    
                    System.out.print(" однозначное число");
                    
                }
                
                else {
                    
                    System.out.print(" двузначное число");
                }
                
                }
            
        }

    }
}
