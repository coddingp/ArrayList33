package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	ArrayList<Integer> integers = new ArrayList<>();
	ArrayList<Integer> integers2 = new ArrayList<>();
	ArrayList<Integer> integers3 = new ArrayList<>();
int a = 0;
        for (int i = 0; i<100; i++){
            integers.add(i);
        }
        for (int i = 0; i < integers.size(); i++){
            if (i != 0) {
                if (i % 2 == 0) {
                    integers2.add(i);
                }
            }
        }
        int value = 0;
        for (int i = 0; i < integers.size(); i++){
                if (integers.get(i) % 2 == 0) {
                    integers.remove(value);
                    value++;
                }
        }

//        for (int i = 0; i < integers.size(); i++){
//            if (integers.get(i) != 0) {
//                if (integers.get(i) % 3 == 0) {
//                    integers3.add(i);
//                }
//            }
//        }
        System.out.println(integers);
        System.out.println(integers2);
        System.out.println(integers3);
    }
}
