package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        File file = new File(reader.readLine());

        BufferedWriter writer = new BufferedWriter(new FileWriter(file));

        String line;

        while (!(line = reader.readLine()).equals("exit")) {
            writer.write(line);
            writer.newLine();
        }
        writer.write("exit");

        reader.close();
        writer.close();


    }
}
