package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String b1 = reader.readLine();
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        if (a > 0 && b > 0)
            System.out.println(1);
        if (a > 0 && b < 0)
            System.out.println(4);
        if (a < 0 && b > 0)
            System.out.println(2);
        if (a < 0 && b < 0)
            System.out.println(3);


    }
}