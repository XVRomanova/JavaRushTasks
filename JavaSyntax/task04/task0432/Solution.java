package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int N = Integer.parseInt(reader.readLine());
        int i = 1;
        while (i <= N){
            System.out.println(a);
            i++;
        }



    }
}
