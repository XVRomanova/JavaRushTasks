package com.javarush.task.task07.task0702;

/* 
Массив из строчек в обратном порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];
        for (int i = 0; i < 8; i++){
            list[i] = reader.readLine();
        }
        for (int j = 0; j < 10; j++){
            System.out.println(list[9-j]);
        }
    }
}