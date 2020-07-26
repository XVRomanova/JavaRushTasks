package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    private Solution() {

    }
    protected Solution(String name){

        System.out.println(name);

    }

    public Solution(int a){
        System.out.println(a);

    }

    Solution(float a){
        System.out.println(a);

    }

    public static void main(String[] args) {

    }
}

