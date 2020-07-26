package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();
        for (int i = 0; i < 5; i++){
            strings.add(r.readLine());
        }
        int l_long = 0;
        for (int i = 0; i < strings.size(); i++){
            if (strings.get(i).length() > l_long){
                l_long = strings.get(i).length();
            }
        }
        for (int i = 0; i < strings.size(); i++){
            if(l_long == strings.get(i).length()){
                System.out.println(strings.get(i));
            }
        }

    }
}
