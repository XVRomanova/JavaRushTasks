package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       ArrayList<Integer> list = new ArrayList<Integer>(5);
        for (int k =0; k < 5; k++){
            list.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < list.size()-1; i++) {

            int min_index = i;

            for (int j = i+1; j < list.size(); j++){
                if (list.get(j) < list.get(min_index)){
                    min_index = j;
                }

            }
            int temp = list.get(min_index);
            list.set(min_index, list.get(i));
            list.set(i, temp);

        }
        for (int m = 0; m < list.size(); m++){
            System.out.println(list.get(m));
        }




        //напишите тут ваш код
    }
}
