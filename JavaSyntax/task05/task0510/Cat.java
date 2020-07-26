package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public void initialize(String name){
        this.name = name;
        this. weight = 6;
        this.age = 3;
        this.color = "Черепаховый";
    }
    public void initialize(String name, int age){
        this.name = name;
        this. weight = 6;
        this.age = age;
        this.color = "Черепаховый";
    }
    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Черепаховый";
    }
    public void initialize( int weight, String color) {

        this.weight = weight;
        this.age = 3;
        this.color = color;
    }
    public void initialize(int weight, String color, String address) {

        this.weight = weight;
        this.age = 3;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
