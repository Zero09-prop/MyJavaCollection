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
		boolean Ys1 = con1.Add(1);
		boolean Ys2 = con1.Add(2);
		boolean Ys3 = con1.Add(3);
		boolean actual = Ys1 && Ys2 && Ys3;
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

}
