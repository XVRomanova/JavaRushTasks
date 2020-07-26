package com.javarush.task.task06.task0606;

/* 
Чётные и нечётные циферки
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     String l = reader.readLine();
     int n =  Integer.parseInt(l);




         for (int k = 0; k < l.length() ; k++) {
             int num = (int) (n / Math.pow(10,k));
             if (num%2 == 0) {
                 even +=1;
             }
             else {
                 odd += 1;
             }


         }
        System.out.println("Even: " + even + " Odd: " + odd);









//        System.out.println(23456/10000);
//        System.out.println((23456/1000)%10);
//        System.out.println((23456/100)%10);
//        System.out.println((23456/10)%10);
//        System.out.println(23456%10);
//        System.out.println(Math.pow(10,2));
    }
}
