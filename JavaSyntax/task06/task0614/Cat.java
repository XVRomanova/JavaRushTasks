package com.javarush.task.task06.task0614;

/* 
Статические коты
*/

import java.util.ArrayList;

public class Cat {
//    public static ArrayList<Cat> cats;
    public static ArrayList<Cat> cats = new ArrayList<>(10);

    public Cat() {

    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            Cat c = new Cat();
            cats.add(c);

        }
        printCats();

    }

    public static void printCats() {
        for (int i = 0; i < 10; i++){
            System.out.println(cats.get(i));
        }

    }
}
