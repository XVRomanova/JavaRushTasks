package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human h1 = new Human("Аня", false, 25 );
        Human h2 = new Human("Катя", false, 26 );
        Human h3 = new Human("Андрей",true, 28 );
        Human h4 = new Human("Валя", true, 29 );
        Human h5 = new Human("Аня", false, 5, h3, h1);
        Human h6 = new Human("Катя", false, 6, h4, h2 );
        Human h7 = new Human("Андрей",true, 7, h3, h1 );
        Human h8 = new Human("Валя", true, 8, h3, h1 );
        Human h9 = new Human("Валя", true, 9, h4, h2 );
        System.out.println(h1.toString());
        System.out.println(h2.toString());
        System.out.println(h3.toString());
        System.out.println(h4.toString());
        System.out.println(h5.toString());
        System.out.println(h6.toString());
        System.out.println(h7.toString());
        System.out.println(h8.toString());
        System.out.println(h9.toString());


    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        public Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human (String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}