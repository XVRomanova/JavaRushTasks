package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int [] list = {1,2,3};
            list[3] = 2;
        }
        catch (Exception e) {
            exceptions.add(e);
        }
        try {
            Object x[] = new String[3];
            x[0] = new Integer(0);

        }
        catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object x = null;
            if (x.equals("Hi")){
                System.out.println("Hi");
            }

        }
        catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int [] nNegArr = new int[-2];

        }
        catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Integer.parseInt("Cat");

        }
        catch (Exception e) {
            exceptions.add(e);
        }

        try {
            List<String> flowers = Arrays.asList("Ageratum", "Allium", "Poppy", "Catmint");
            flowers.add("Sunflower");

            }
        catch (Exception e) {
            exceptions.add(e);
        }

        Exception e2 = new
                IllegalArgumentException();
        exceptions.add(e2);
        Exception e3 = new
                ClassCastException();
        exceptions.add(e3);
        Exception e4 = new
                IllegalMonitorStateException();
        exceptions.add(e4);



    }
}
