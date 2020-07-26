package com.javarush.task.task12.task1217;

/* 
Лететь, бежать и плыть
*/

public class Solution {
    public static void main(String[] args) {

    }

    interface CanFly{
        void fly(String address);
    }

    public interface CanRun{
        void run(String address);
    }
    public interface CanSwim{
        void swim(String address);
    }
}
