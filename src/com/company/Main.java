package com.company;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCollection a = new MyCollection(5);
		a.Add(1);
		a.Add(1,2);
		a.Add(2,3);
        System.out.println(a.get(2));
        
	}

}
