package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int [] a = new int[10];
        int [] b = new int[10];
        for (int i = 0; i <10 ; i++) {
            a[i] = i+1;
            b[i] = a[i];
        }
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <10 ; j++) {
                System.out.print(a[i]*b[j]+" ");
            }
            System.out.println();
        }
    }
}
