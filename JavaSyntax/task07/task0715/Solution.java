package com.javarush.task.task07.task0715;

/* 
Продолжаем мыть раму
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Solution {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<String>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");


        for (int i = list.size()-1; i >= 0; i--) {
            list.add(i +1, "именно");

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
