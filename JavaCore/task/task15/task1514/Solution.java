package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static
    {
        labels.put(12.3,"Cat");
        labels.put(13.5,"Dog1");
        labels.put(6.5,"Dog2");
        labels.put(3.2,"Cat1");
        labels.put(1.1,"Dog3");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
