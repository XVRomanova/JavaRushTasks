package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(12,43));
        System.out.println(convertEurToUsd(13,15));

    }

    public static double convertEurToUsd(int eur, double course) {
        return (eur*course);

    }
}
