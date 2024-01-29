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

    /*
    A method called indexOf() that takes one parameter, a String to be found in the list. The method should return
    an int indicating the position at which the String could be found. If the String could not be found, an appropriate
    value should be returned to indicate this
     */

    public int indexOf(String toFind){
        for(int i = 0; i < size; i++){
            if(toFind.equals(array[i])){
                return i;
            }
        }
        return -1;
    }

    /*
    A method called add() that takes a single parameter, a String to be added. This String should be added to the
    end of the list. If there is insufficient space in the list, the internal array should be grown, and the String added
    then. Null values should be allowed. The method should return a boolean indicating if the String was added.
     */

    public boolean add(String element){
        if (this.hasSpace()){
            growArray();
            array[size - 1] = element;
            return true;
        } else {
            return false;
        }
    }

    public void growArray(){
        size++;
        String[] copiedArray = new String[size];
        System.arraycopy(this.array, 0, copiedArray, 0, size - 1);
        this.array = copiedArray;
    }

    public boolean hasSpace(){
        return size < array.length;
    }
}
