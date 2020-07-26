package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t1.printResult();
        t2.printResult();
    }

    public static class Read3Strings extends Thread {
        ArrayList<String> arrayList = new ArrayList<>();

        public void run() {
            try {
                String first = reader.readLine();
                arrayList.add(first);
                String second = reader.readLine();
                arrayList.add(second);
                String third = reader.readLine();
                arrayList.add(third);

            }
            catch (IOException e) {

            }

        }
        public void printResult() {
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.print(arrayList.get(i));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
