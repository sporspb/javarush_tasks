package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        HashMap<String,String> map = new HashMap<>();
        map.put("Красников","Юрий");
        map.put("Путин","Вова");
        map.put("Зелинский","Виктор");
        map.put("Путин","Кирилл");
        map.put("Андреев","Вор");
        map.put("Красников","Юрий");
        map.put("Ростоков","Игорь");
        map.put("Бачин","Юрий");
        map.put("Путин","Вова");
        map.put("Беглов","Кирилл");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
