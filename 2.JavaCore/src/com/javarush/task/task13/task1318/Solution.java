package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args)  throws Exception{
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = null;

            path = reader.readLine();
            FileInputStream fileInputStream = new FileInputStream(path);
            while (fileInputStream.available() > 0) {
                System.out.print((char) fileInputStream.read()); // выводим содержимое файла на экран построчно

            }
        reader.close(); // закрываем поток
        fileInputStream.close();






    }


}