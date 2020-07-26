package com.javarush.task.task07.task0707;

/* 
Что за список такой?
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("ri");
        list.add("ki");
        list.add("ko");
        list.add("as");
        list.add("ae");
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
