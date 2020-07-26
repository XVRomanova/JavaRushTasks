package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();

        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; i++){
            strings.add(reader.readLine());
        }


        for (int i = 0; i < M; i++){
            strings.add(strings.get(i));
        }

        for (int i = M-1; i >= 0; i--){
            strings.remove(i);
        }

        for (int i = 0; i < strings.size(); i++){
            System.out.println(strings.get(i));
        }
    }
}
