package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String число =reader.readLine();
        String имя = reader.readLine();


        System.out.println(имя + " захватит мир через " + число + " лет. Му-ха-ха!");

    }
}
