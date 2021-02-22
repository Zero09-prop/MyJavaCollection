package com.company;

import java.util.Iterator;

public class MyCollection implements Iterable<Integer> {

    private int[] _storage;
    private int _size;

    public MyCollection()
    {
        _storage = new int[5];
        _size = 0;
      
    }
    
    public MyCollection(int capacity)
    {
        _storage = new int[capacity];
        _size = 0;

    }
    public int size() {
        return _size;
    }

    public int get(int index) {
        if (index < 0 || index >= _size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return _storage[index];
    }

    public int set(int index, int newValue) {
        if (index < 0 || index >= _size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int el = _storage[index];
        _storage[index] = newValue;
        return  el;
    }

    public boolean remove(int index) {
        if (_size - 1 - index >= 0) {
            System.arraycopy(_storage, index + 1, _storage, index, _size - 1 - index);
            _size--;
            return true;
        } else {
            return false;
        }
    }

    public boolean Add(int element) {
        if (_storage.length == _size) {
            ensureCapacity((_storage.length) * 2);
        }
        _storage[_size] = element;
        _size++;
        return true;
    }

    public void Add(int index, int element) {
        if (index == _storage.length) {
            Add(element);
        } else {
            _storage[index] = element;
            _size++;
        }
    }

    /**
     * Returns true if this array contains no elements.
     *
     * @return true if this array contains no elements
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Returns the capacity of the array.
     *
     * @return the capacity of the array
     */
    public int getCapacity() {
        return _storage.length;
    }

    /**
     * Reduces the capacity of array to current size.
     */
    public void trimToSize() {
        ensureCapacity(size());
    }

    /**
     * Removes all of the elements from this array.
     */
    public void clear() {
        _size = 10;
        _storage =  new int[10];
    }


    /**
     * Sets up new capacity of the array.
     *
     * @param newSize new capacity to be set
     */
    public void ensureCapacity(int newSize) {
        int[] temp = _storage;
        _storage =  new int[newSize];
        if (_size > 0) {
            System.arraycopy(temp, 0, _storage, 0, _size);
        }
    }
    public Iterator<Integer> iterator() {
        return new ArrayListIterator();

    }
    private class ArrayListIterator implements java.util.Iterator<Integer> {

        private int current = 0;
        public boolean hasNext() {
            return current < size();
        }
        public Integer next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            return _storage[current++];
        }

        public void remove() {
        	MyCollection.this.remove(--current);
        }

    }
    }
