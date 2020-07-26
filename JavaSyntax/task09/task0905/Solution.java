package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) {

        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        int len = stackTraceElement.length;

        System.out.println(len);
        return len;
    }
}

