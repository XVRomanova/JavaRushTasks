package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String имя = reader.readLine();
        String число1 = reader.readLine();
        String число2 = reader.readLine();
        System.out.println(имя + " получает " + число1 + " через " + число2 + " лет.");

    }
}
