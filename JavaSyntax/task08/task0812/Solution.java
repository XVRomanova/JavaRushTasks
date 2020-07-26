package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();



        for (int i = 0; i < 10; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }

        int counter = 1;
        int max = 1;

        if (list.isEmpty()){
            max = 0;
        }



        for (int i = 1; i < list.size(); i++) {

            if (list.get(i-1).equals(list.get(i))) {
                counter += 1;
                if (counter > max) {
                    max = counter;
                }
            }
            else {
                    counter =1;
            }

        }
        System.out.println(max);
    }
}