package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Loakle", df.parse("JUNE 1 1980"));
        map.put("Polkoi", df.parse("JUNE 1 1980"));
        map.put("Pidor", df.parse("JUNE 1 1980"));
        map.put("Pussy", df.parse("JUNE 1 1980"));
        map.put("Dick", df.parse("JUNE 1 1980"));
        map.put("Fuck", df.parse("JUNE 1 1980"));
        map.put("Suck", df.parse("DECEMBER 1 1980"));
        map.put("Leak", df.parse("JUNE 1 1980"));
        map.put("Ride", df.parse("MARCH 1 1980"));

        //напишите тут ваш код
        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        map.values().removeIf(date -> (date.getMonth()>=5)&&(date.getMonth()<=7));

    }

    public static void main(String[] args) throws ParseException {
        /*
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        date = df.parse("JUNE 1 1980");
        System.out.println(date.getMonth());
        HashMap map = createMap();
        removeAllSummerPeople(map);
        map.entrySet().forEach(set -> System.out.println(set));
        */
    }
}
