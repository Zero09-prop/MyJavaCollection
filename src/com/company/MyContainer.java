package com.company;

import java.util.Arrays;

public class MyContainer
{

    private int[] _storage;
    private int _currPos;
    public MyContainer()
    {
        _storage = new int[2];
        _currPos = 0;
    }

    public MyContainer(int capacity)
    {

        _storage = new int[capacity];
        _currPos = 0;
    }

    public void Add(int index,int element)
    {
        if(index < _storage.length)
        {
            
        }
        else{
            throw new IndexOutOfBoundsException();
        }
    }

    public void Add(int element){
        if(_currPos < _storage.length)
        {
            _storage[_currPos] = element;
            _currPos++;
        }
        else{
            int[] temp = new int[_storage.length * 2];
            for(int i = 0; i < _storage.length;i++){
                temp[i] = _storage[i];
            }
            temp[_currPos] = element;
            _storage = temp;
            _currPos++;
        }
    }


}
