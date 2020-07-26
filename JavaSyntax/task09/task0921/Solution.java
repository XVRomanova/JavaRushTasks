package com.javarush.task.task09.task0921;

/* 
Метод в try..catch
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        readData();
    }

    public static void readData() {
        List<Integer> list = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int i =0;
            while (i>=0){
                list.add(Integer.parseInt(reader.readLine()));
            }
        }
        catch (Exception e) {
           for(int i =0; i < list.size(); i++){
               System.out.println(list.get(i));
           }
        }


    }
}
