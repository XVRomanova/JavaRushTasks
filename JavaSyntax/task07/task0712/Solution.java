package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();
        for (int i = 0; i < 10; i++){
            strings.add(reader.readLine());
        }
        int index_long = 0;
        int index_short = 0;

        for (int i = 1; i < strings.size(); i++){
            if (strings.get(i).length() > strings.get(index_long).length()) {
                index_long = i;

            }
        }
        for (int i = 1; i < strings.size(); i++){
            if (strings.get(i).length() < strings.get(index_short).length()) {
                index_short = i;

            }
        }

        if(index_long < index_short) {
            System.out.println(strings.get(index_long));
        }
        else
            System.out.println(strings.get(index_short));


    }
}
