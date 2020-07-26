package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {


        Human children1 = new Human("Pavel",true,3, new ArrayList<Human>());
        Human children2 = new Human("Alex",true,2, new ArrayList<Human>());
        Human children3 = new Human("Kristina",false,5, new ArrayList<Human>());



        Human mother = new Human("Kate",false,32,new ArrayList<>(Arrays.asList(children1,children2,children3)));
        Human father = new Human("Garry",true,33,new ArrayList<>(Arrays.asList(children1,children2,children3)));



        Human grandmother1 = new Human("Alica",false,70,new ArrayList<>(Arrays.asList(mother)));
        Human grandmother2 = new Human("Mary",false,75,new ArrayList<>(Arrays.asList(father)));

        Human grandfather1 = new Human("Jone",true,70,new ArrayList<>(Arrays.asList(mother)));
        Human grandfather2 = new Human("Arthur",true,75,new ArrayList<>(Arrays.asList(father)));

        System.out.println(children1.toString());
        System.out.println(children2.toString());
        System.out.println(children3.toString());
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(grandfather1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandmother2.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;

        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
