package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("Романова",500);
        map.put("Иванов",100);
        map.put("Петров",200);
        map.put("Сидоров",300);
        map.put("Ромашков",600);
        map.put("Пак",65);
        map.put("Минаков",14);
        map.put("Абрамов",89);
        map.put("Кролик",67);
        map.put("Перчик",60);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        map.entrySet().removeIf(entry -> entry.getValue() <  500);


    }

    public static void main(String[] args) {


    }
}