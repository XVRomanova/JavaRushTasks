package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Цукерберг", dateFormat.parse("MAY 27 2012"));
        map.put("Марскакопоне", dateFormat.parse("JULY 1 2012"));
        map.put("Маск", dateFormat.parse("JUNE 1 2012"));
        map.put("Романов", dateFormat.parse("MAY 1 2012"));
        map.put("Локс", dateFormat.parse("MAY 1 2012"));
        map.put("КУрим", dateFormat.parse("MAY 1 2012"));
        map.put("Жоран", dateFormat.parse("MAY 1 2012"));
        map.put("Куцекур", dateFormat.parse("MAY 1 2012"));
        map.put("Юболаг", dateFormat.parse("MAY 1 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {

        map.entrySet().removeIf(pair -> pair.getValue().getMonth() == Calendar.JUNE);
        map.entrySet().removeIf(pair -> pair.getValue().getMonth() == Calendar.JULY);
        map.entrySet().removeIf(pair -> pair.getValue().getMonth() == Calendar.AUGUST);

    }



    public static void main(String[] args) {

    }
}
