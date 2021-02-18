package com.company;

public class MyContainer {

    private int[] objects;

    public MyContainer()
    {
        objects = new int[5];
    }

    public MyContainer(int capacity)
    {
        objects = new int[capacity];
    }

    public void Add(int index,int element)
    {
        if(index < objects.length)
        {

        }
        else{
            throw new IndexOutOfBoundsException();
        }

    }
}
