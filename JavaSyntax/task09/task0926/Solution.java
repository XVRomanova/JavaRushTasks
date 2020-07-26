package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> arrayList = new ArrayList<>();
        int [] nums1 = { 1, 2, 8, 6, 5};
        int[] nums2 = { 1, 2};
        int [] nums3 = { 9, 2, 4, 5 };
        int[] nums4 = { 6, 4, 5, 5, 7, 8, 9 };
        int[] nums5 = { };

        arrayList.add(nums1);
        arrayList.add(nums2);
        arrayList.add(nums3);
        arrayList.add(nums4);
        arrayList.add(nums5);


        return arrayList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
