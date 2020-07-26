package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String,String> map = new HashMap<>();
        map.put("1","A");
        map.put("2","A");
        map.put("2","B");
        map.put("3","A");
        map.put("4","A");
        map.put("5","A");
        map.put("6","A");
        map.put("7","A");
        map.put("8","A");
        map.put("9","A");


        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
