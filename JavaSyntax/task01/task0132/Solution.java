package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(sumDigitsInNumber(546));
    }


    public static int sumDigitsInNumber(int number) {
        int numeral1 = number/100;

        int numeral2 = (number%100)/10;

        int numeral3 = number%10;

        return (numeral1+numeral2+numeral3);


    }
}