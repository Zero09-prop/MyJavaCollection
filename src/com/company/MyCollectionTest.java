package com.company;
import static org.junit.Assert.*;

import org.junit.Test;

public class MyCollectionTest {

	@Test
	public void testRemove() {
		MyCollection con1 = new MyCollection();
        con1.Add(1);
        con1.Add(2);
        con1.Add(3);
        boolean actual = con1.remove(3);
        boolean  expected = false;
        assertEquals(expected,actual);
	}

	@Test
	public void testAddInt() {
		MyCollection con1 = new MyCollection();
		con1.Add(1);
		con1.Add(2);
		con1.Add(3);
		boolean actual = (con1.get(0) == 1) && (con1.get(1) == 2) && (con1.get(2) == 3);
		boolean expected = true;
		assertEquals(expected,actual);
	}

	@Test
	public void testAddIntInt() {
		MyCollection con1 = new MyCollection();
		con1.Add(1);
		con1.Add(1,2);
		con1.Add(2,3);
		int el1 = con1.get(1);
		int el2 = con1.get(2);
		boolean actual = (el1 == 2) && (el2 == 3);
		boolean expected = true;
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void testSize() {
		MyCollection con1 = new MyCollection();
		con1.Add(1);
		con1.Add(2);
		con1.Add(3);
		int actual = con1.size();
		int expected = 3;
		assertEquals(expected,actual);
	}
	
	@Test
	public void testGet() {
		MyCollection con1 = new MyCollection();
		con1.Add(3);
		int actual = con1.get(0);
		int expected = 3;
		assertEquals(expected,actual);
	}
	
	@Test
	public void testSet() {
		MyCollection con1 = new MyCollection();
		con1.Add(3);
		con1.set(0, 4);
		int actual = con1.get(0);
		int expected = 4;
		assertEquals(expected,actual);
	}
}
