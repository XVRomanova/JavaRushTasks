package com.javarush.task.task13.task1313;

/* 
Лисица — это такое животное
*/

import java.awt.*;

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        default void getColor(){

        }
    }

    public static  class Fox implements Animal{

        public String getName() {
            return "Fox";
        }
    }
}