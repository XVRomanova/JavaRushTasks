package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg z1 = new Zerg();
        Zerg z2 = new Zerg();
        Zerg z3 = new Zerg();
        Zerg z4 = new Zerg();
        Zerg z5 = new Zerg();
        z1.name = "1";
        z2.name = "2";
        z3.name = "3";
        z4.name = "4";
        z5.name = "5";
        Protoss p1 = new Protoss();
        Protoss p2 = new Protoss();
        Protoss p3 = new Protoss();
        p1.name = "6";
        p2.name = "7";
        p3.name = "8";
        Terran t1 = new Terran();
        Terran t2 = new Terran();
        Terran t3 = new Terran();
        Terran t4 = new Terran();
        t1.name = "9";
        t2.name = "10";
        t3.name = "11";
        t4.name = "12";

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
