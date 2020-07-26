package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float t = Float.parseFloat(reader.readLine());
        float c = t%5;
        if (t > 5) {
            if (c >= 0 & c < 3) {
                System.out.println("зеленый");
            }
            else {
                if (c >= 3 & c < 4 ) {
                    System.out.println("желтый");
                }
                if (c >= 4 & c < 5 ) {
                    System.out.println("красный");
                }

            }
        }
        else {
            if (t >= 0 & t < 3 || t==5) {
                System.out.println("зеленый");
            }
            else {
                if (t >= 3 & t < 4 ) {
                    System.out.println("желтый");
                }
                if (t >= 4 & t < 5 ) {
                    System.out.println("красный");
                }

            }

        }

    }
}