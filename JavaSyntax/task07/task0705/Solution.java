package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20];
        int[] list_1 = new int[10];
        int[] list_2 = new int[10];

        for (int i = 0; i < 20; i++){
            list[i] = Integer.parseInt(reader.readLine());
        }
        for (int j = 0; j < list.length/2; j ++) {
            list_1[j] = list[j];
        }
        for (int k = 0; k <  10; k ++) {
            list_2[k] = list[k+10];
            System.out.println(list_2[k]);
        }

    }
}
