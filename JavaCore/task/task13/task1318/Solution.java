package com.javarush.task.task13.task1318;

/* 
Чтение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        InputStream inStream = new FileInputStream(name);

        while (inStream.available() > 0)
        {
            char data = (char) inStream.read();
            System.out.print(data);

        }
        inStream.close();
        reader.close();
    }
}