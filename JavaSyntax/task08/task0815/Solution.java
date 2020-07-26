package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String,String> map = new HashMap<String, String>();

        map.put("Макаров","Антон");
        map.put("Тереяки","Ростянка");
        map.put("Малофеева","Екатерина");
        map.put("Стеценко","Константин");
        map.put("Иващенко","Антон");
        map.put("Карпатов","Кирилл");
        map.put("Ростовская","Соня");
        map.put("Иброгимов","Калибр");
        map.put("Брусникин","Антон");
        map.put("Антоновна","Лукреция");

        return map;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count  = 0;
        for (String tmp : map.values()) {
            if(name.equals(tmp)) {
                count++;
            }
        }
        return count;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (String tmp : map.keySet()){
            if(lastName.equals(tmp)){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {

    }
}
