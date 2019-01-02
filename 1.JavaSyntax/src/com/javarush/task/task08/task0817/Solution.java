package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String,String> SalaryTab = new HashMap<>();
        SalaryTab.put("Красников", "Юрий");
        SalaryTab.put("Галеев", "Айдар");
        SalaryTab.put("Путин", "Вор");
        SalaryTab.put("Ильин", "Матвей");
        SalaryTab.put("Матвеев", "Игорь");
        SalaryTab.put("Кузьмин", "Алексей");
        SalaryTab.put("Лободанов", "Вор");
        SalaryTab.put("Тимофеев", "Алекс");
        SalaryTab.put("Бузников", "Вова");
        SalaryTab.put("Гостюхин", "Вор");

        return SalaryTab;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<String, String>(map);

        for (Map.Entry<String,String> m: copy.entrySet()) {
            String firstname = m.getValue();
            int count = 0;
            for (Map.Entry<String,String> n: copy.entrySet()) {
                if (n.getValue().equals(firstname)) {
                count++;
                }
            }
            if (count>=2) {
                removeItemFromMapByValue(map, m.getValue());
            }

        }


    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
       /*
        HashMap<String,String> map = createMap();
        removeTheFirstNameDuplicates(map);

        map.entrySet().forEach(m -> System.out.println(m));
        */

    }
}
