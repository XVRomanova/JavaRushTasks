package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while(!(s = reader.readLine()).equals("exit")){
            try {
                if (s.contains(".")){
                    Double value = Double.parseDouble(s);
                    print(value);
                }
                else if (Integer.parseInt(s) > 0 && Integer.parseInt(s) < 128 ) {
                    Short value = Short.parseShort(s);
                    print(value);
                }
                else if (Integer.parseInt(s) <= 0 || Integer.parseInt(s) >= 128 ) {
                    Integer value = Integer.parseInt(s);
                    print(value);
                }


            }
            catch (Exception e){
                print(s);
            }


        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
