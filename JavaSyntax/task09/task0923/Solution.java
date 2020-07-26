package com.javarush.task.task09.task0923;

/* 
Гласные и согласные
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = reader.readLine().split(" ");
        List<String> vowels = new ArrayList<>();
        List<String> another = new ArrayList<>();




        for(int i = 0; i < s.length; i++) {
            char [] chars = s[i].toCharArray();
            for(int j = 0; j < chars.length; j++){
                if(isVowel(chars[j])){
                    vowels.add(chars[j]+" ");
                }
                else {
                    another.add(chars[j]+" ");
                }
            }

        }

        for (String strings: vowels){
            System.out.print(strings);
        }
        System.out.println();
        for (String strings: another){
            System.out.print(strings);
        }

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}