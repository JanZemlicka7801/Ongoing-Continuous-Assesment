package utils;

public class DynamicArrayList {

    private static final int capacity = 10;
    private String[] array;
    private int size;

    public DynamicArrayList(){
        this.array = new String[capacity];
        this.size = 0;
    }

    public int size(){
        return size;
    }

    /*
    A method called get() that takes a single parameter, an int representing the position from which data should be
    retrieved. The position should be validated and invalid positions handled accordingly.
    If the position is valid, the method should return the data (a String) in the position specified.
     */

    public String get(int position){
        if (position < 0 || position >= size)
            throw new ArrayIndexOutOfBoundsException("Array Index is out of bounds.");
        return this.array[position];
    }
}
