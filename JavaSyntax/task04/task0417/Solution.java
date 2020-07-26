package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String b1 = reader.readLine();
        String c1 = reader.readLine();
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        int c = Integer.parseInt(c1);
        if (a == b & b == c)
            System.out.print(a +" "+ b+ " " + c);

        if (a == b & b!= c)
            System.out.println(a +" "+ b);
        if (a == c & c!= b)
            System.out.println(a +" "+ c);
        if (b == c & c!= a)
            System.out.println(b +" "+ c);





    }
}