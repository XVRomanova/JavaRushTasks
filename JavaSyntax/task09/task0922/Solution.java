package com.javarush.task.task09.task0922;

/* 
Какое сегодня число?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {

    public static void main(String[] args) throws Exception {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Date date = df.parse(reader.readLine());
        DateFormat df1 = new SimpleDateFormat("MMM dd, YYYY", Locale.ENGLISH);

        System.out.println(df1.format(date).toUpperCase());

    }
}
