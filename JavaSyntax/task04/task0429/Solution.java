package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int plus = 0;
        int minus = 0;
        if (a > 0)
            plus++;
        else
            if(a!=0)
                minus++;
        if (b > 0)
            plus++;
        else
            if(b!=0)
                minus++;
        if (c > 0)
            plus++;
        else
            if (c!=0)
                minus++;
        System.out.println("количество положительных чисел: "+plus);
        System.out.println("количество отрицательных чисел: "+minus);

    }
}
