package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(r.readLine());
        int y = Integer.parseInt(r.readLine());
        int z = Integer.parseInt(r.readLine());
        
        if ((x >= y) && (x <= z) || (x <= y) && (x >= z)) {
            
            System.out.println(x);
        }
        else {
        if ((y >= x) && (y <= z) || (y <= x) && (y >= z)) {
            
            System.out.println(y);
        }
        
        else {
            
            if ((z >= y) && (z <= x) || (z <= y) && (z >= x)) {
            
            System.out.println(z);
        }
        }
        }
        
        
    }
}
