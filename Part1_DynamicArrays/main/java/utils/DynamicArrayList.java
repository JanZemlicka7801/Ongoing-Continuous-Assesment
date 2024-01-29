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
}
