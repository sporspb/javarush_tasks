package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
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

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String,String> m: map.entrySet()) {
            if (m.getValue().equals(name)) {
                count++;
            }
        }
        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String,String> m: map.entrySet()) {
            if (m.getKey().equals(lastName)) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        /*
        HashMap newtab = createMap();
        System.out.println(getCountTheSameFirstName(newtab,"Вор"));
        System.out.println(getCountTheSameLastName(newtab,"Путин"));
        */
    }
}
