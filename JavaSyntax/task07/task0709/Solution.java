package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 5; i++){
            list.add(r.readLine());
        }
        int sh = list.get(0).length();
        for (int j = 1; j < 5; j++){
            if (list.get(j).length() < sh){
                sh = list.get(j).length();
            }

        }
        for (int j = 0; j <5; j++){
            if (list.get(j).length() == sh){
                System.out.println(list.get(j));
            }
        }
    }
}
