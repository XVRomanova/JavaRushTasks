package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import javax.swing.*;
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String b1 = reader.readLine();
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);

        if (a < b)
            System.out.println(a);
        else {
            if (b < a)
                System.out.println(b);
            else
                System.out.println(a);
        }



    }
}