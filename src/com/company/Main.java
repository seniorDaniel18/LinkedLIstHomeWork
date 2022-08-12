package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int[] arrayy = new int[5];
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();


        for (int i = 0; i < arrayy.length; i++) {
            arrayy[i] = random.nextInt(0, 2);
        }
        for (int i = 0; i < 5; i++) {
            arrayList.add(random.nextInt(0, 2));
        }
        for (int i = 0; i < 5; i++) {
            linkedList.add(random.nextInt(0, 2));
        }

        comArrList(arrayList);
        comLink(linkedList);
        comArr(arrayy);

    }

    public static void comArrList(List list) {

        Collections.sort(list);
        System.out.println(list);
    }

    public static void comLink(List list) {

        Collections.sort(list);
        System.out.println(list);
    }

    public static void comArr(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
            System.out.print(array[i] + " ");
        }
    }
}