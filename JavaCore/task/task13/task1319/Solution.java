package com.javarush.task.task13.task1319;

/* 
Писатель в файл с консоли
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(name));
        String text ;
        while (!(text=reader.readLine()).equals("exit")){
            writer.write(text +"\n");
            writer.flush();
        }
        writer.write("exit");
        writer.close();
    }
}
