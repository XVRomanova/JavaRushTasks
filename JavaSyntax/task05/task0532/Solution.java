package com.javarush.task.task05.task0532;

/* 
Задача по алгоритмам
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        if (N <= 0) {
            return;
        }


        int maximum = Integer.parseInt(reader.readLine());
        for (int i = 1; i < N; i++) {
            int n = Integer.parseInt(reader.readLine());

            if (n > maximum){
                maximum = n;
            }
        }
        System.out.println(maximum);

    }




}



