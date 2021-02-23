package com.company;

import java.util.Iterator;

public class MyCollection implements Iterable<Integer> {

    private int[] _storage;
    private int _size;

    /**
     * Default collection initializer
     */
    public MyCollection()
    {
        _storage = new int[5];
        _size = 0;
      
    }
    /**
     * Collection initializer
     * @param - capacity - original collection capacity 
     */
    public MyCollection(int capacity)
    {
        _storage = new int[capacity];
        _size = 0;

    }
    /**
     * Returns the number of items in the collection
     * 
     * @return the number of items in this collection
     */
    public int size() {
        return _size;
    }

    /**
     * Returns the element at the requested index
     * 
     * @param index - the index of the required element
     * @return - element required
     * @throws ArrayIndexOutOfBoundsException if index greater than size of array
     */
    public int get(int index) {
        if (index < 0 || index >= _size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return _storage[index];
    }
    /**
     * replaces element at index with new value
     * @param index - the index of the element being replaced
     * @param newValue - new meaning
     * @return the element previously at the specified position
     * @throws ArrayIndexOutOfBoundsException if index greater than size of array
     */
    public int set(int index, int newValue) {
        if (index < 0 || index >= _size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int el = _storage[index];
        _storage[index] = newValue;
        return  el;
    }
    
    /**
     * Removes an element at a given position
     * @param index - the index of the element to be removed
     * @return true if collection contains element with this index
     */
    public boolean remove(int index) {
        if (_size - 1 - index >= 0) {
            System.arraycopy(_storage, index + 1, _storage, index, _size - 1 - index);
            _size--;
            return true;
        } else {
            return false;
        }
    }
    /**
     * Adds the given item to the end of the collection
     * @param element - element to add to the end of the collection
     * 
     */
    public void Add(int element) {
        if (_storage.length == _size) {
            ensureCapacity((_storage.length) * 2);
        }
        _storage[_size] = element;
        _size++;
    }
    /**
     * Inserts the specified element at the specified position in this array.
     * @param index - the index of the element is to be inserted
     * @param element - insert element
     */
    public void Add(int index, int element) {
        if (index == _storage.length) {
            Add(element);
        } else {
            _storage[index] = element;
            _size++;
        }
    }

    /**
     * Checks for elements in the collection
     *
     * @return true if this collection contains no elements
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Getting the capacity of a collection
     *
     * @return the capacity of the collection
     */
    public int getCapacity() {
        return _storage.length;
    }

    /**
     * Reduces the capacity of collection to current size.
     */
    public void trimToSize() {
        ensureCapacity(size());
    }

    /**
     * Removes all of the elements from this collection.
     */
    public void clear() {
        _size = 0;
        _storage =  new int[10];
    }


    /**
     * Sets up new capacity of the collection.
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
    /**
     * Returns an iterator over the elements in this collection in proper sequence.
     *
     * @return an iterator over the elements in this collection in proper sequence
     */
    
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
