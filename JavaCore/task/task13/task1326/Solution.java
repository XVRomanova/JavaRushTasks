package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        while (fileReader.ready()) {

            int data = Integer.parseInt(fileReader.readLine());
            if (data % 2 == 0) {
                arrayList.add(data);

            }
        }
        reader.close();
        fileReader.close();

        Collections.sort(arrayList);

        for (int counter : arrayList) {
            System.out.println(counter);

        }


    }
}
