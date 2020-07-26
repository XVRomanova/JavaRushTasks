package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1 = reader.readLine();
        int n = Integer.parseInt(n1);
        if (n > 0)
            System.out.println(2*n);
        if (n < 0)
            System.out.println(n+1);
        if (n == 0)
            System.out.println(n);


    }

}