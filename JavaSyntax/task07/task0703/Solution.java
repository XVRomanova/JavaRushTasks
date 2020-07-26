package com.javarush.task.task07.task0703;

/* 
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];
        int[] list_i = new int[10];

        for (int i = 0; i < 10; i++){
            list[i] = reader.readLine();
            list_i[i] = list[i].length();

            }
        for (int j = 0; j < 10; j++){
            System.out.println(list_i[j]);
        }

    }
}
