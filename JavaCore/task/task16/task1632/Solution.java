package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    public static void main(String[] args) {

    }
    static {
        threads.add(new FirstThread());
        threads.add(new SecondThread());
        threads.add(new ThirdThread());
        threads.add(new ForthThread());
        threads.add(new FifthThread());

    }

    public static class FirstThread extends Thread {
        @Override
        public void run() {
            while (true) {

            }
        }
    }

    public static class SecondThread extends Thread {

        @Override
        public void run() {
            try{
                Thread.sleep(1000);

            }
            catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class ThirdThread extends Thread {
        @Override
        public void run() {
            try {
                while (!this.isInterrupted()) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }

            }
            catch (InterruptedException e) {

            }
        }

    }

    public static class ForthThread extends Thread implements Message {

        @Override
        public void run() {
            while (!this.isInterrupted()) {

            }

        }
        @Override
        public void showWarning() {
            this.interrupt();
        }
    }

    public static class FifthThread extends Thread {
        @Override
        public void run() {
            ArrayList<Integer> list = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                  int result = 0;
                while (!Thread.currentThread().isInterrupted()) {
                    String tmp = reader.readLine();
                    if (tmp.equals("N")) {
                        System.out.println(result);
                    }
                    result += Integer.parseInt(tmp);
                }

            } catch (Exception e) {

            }


        }




    }

}