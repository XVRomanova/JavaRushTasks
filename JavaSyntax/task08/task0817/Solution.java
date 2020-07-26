package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String,String> map = new HashMap<String, String>();
        map.put("Одинцов","Алексей");
        map.put("Rozkova","Daria");
        map.put("Romanova","Alina");
        map.put("Zukava","Tatiana");
        map.put("Covalevskiy","Vyacheslav");
        map.put("Ria","Anton");
        map.put("Popkov","Anton");
        map.put("Romashkova","Lida");
        map.put("Polsik","Kirill");
        map.put("Rolok","Rostislav");

        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String,String> a = new HashMap<String,String>();
        a.putAll(map);
        for(Map.Entry<String, String> b : a.entrySet()) {
            String a1 = b.getValue();
            int i = 0;
            for(Map.Entry<String, String> b1 : a.entrySet()) {
                if(b1.getValue().equals(a1)) {
                    i++;
                }
                if(i>=2) {
                    removeItemFromMapByValue(map,a1);
                }
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
