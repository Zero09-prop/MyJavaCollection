package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> mu = new ArrayList<Integer>(4);
        mu.add(5);
        mu.add(6);
        mu.add(6,7);
        int[] a = new int[2];
        int[] b;
        a[0] = 1;
        a[1] = 3;
        System.out.println(a);
    }
}