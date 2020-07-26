package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int counter1 = 0;
        int counter2 = 0;
        if (this.age > anotherCat.age) {
            counter1++;
        }
        else if (this.age < anotherCat.age)
            counter2++;

        if (this.weight > anotherCat.weight) {
            counter1++;
        }
        else if (this.weight < anotherCat.weight)
            counter2++;

        if (this.strength > anotherCat.strength) {
            counter1++;
        }
        else if (this.strength < anotherCat.strength) {
            counter2++;
        }
        if (counter1 >= counter2)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
//        Cat cat1 = new Cat();
//        cat1.age = 4;
//        cat1.weight = 5;
//        cat1.strength = 6;
//        Cat cat2 = new Cat();
//        cat2.age = 1;
//        cat2.weight = 1;
//        cat2.strength = 1;
//        System.out.println(cat2.fight(cat1));
    }
}
