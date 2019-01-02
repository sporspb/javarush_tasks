package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String,Integer> SalaryTab = new HashMap<>();
        SalaryTab.put("Красников", 1200);
        SalaryTab.put("Галеев", 1500);
        SalaryTab.put("Путин", 200);
        SalaryTab.put("Ильин", 100);
        SalaryTab.put("Матвеев", 1100);
        SalaryTab.put("Кузьмин", 1000);
        SalaryTab.put("Лободанов", 500);
        SalaryTab.put("Тимофеев", 600);
        SalaryTab.put("Бузников", 300);
        SalaryTab.put("Гостюхин", 150);
        return SalaryTab;
        }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        map.entrySet().removeIf(entry -> entry.getValue() < 500);


        }


    public static void main(String[] args) {

       /* HashMap hashMap = createMap();
        hashMap.forEach((a,b) -> System.out.println(a+ ":" +b));
        removeItemFromMap(hashMap);
        hashMap.forEach((a,b) -> System.out.println(a+ ":" +b));
        */
    }
}