package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyContainer my = new MyContainer();
        my.Add(6,7);
        int[] m = new int[2];
       // ArrayList<Integer> lst = new ArrayList<Integer>();
       // lst.add(5,5);
        for(int i = 0; i < 2; i++)
            System.out.println(m[i]);
    }
}
