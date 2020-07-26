package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String y = reader.readLine();
        int year = Integer.parseInt(y);

        if (year % 400 == 0) {
            System.out.println("количество дней в году: 366");
            return;
        }

        if (year % 100 == 0) {
            System.out.println("количество дней в году: 365");
            return;
        }

        if (year % 4 == 0) {
            System.out.println("количество дней в году: 366");
            return;
        }

        System.out.println("количество дней в году: 365");
    }
}