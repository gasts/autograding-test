package main.java.de.hems;

public class ArraySum {

    private int size;
    private int[] array = null;

    public ArraySum(int size){
        this.size = size;
    }

    public int[] getArray(){
        return array;
    }

    public void createArray(){
        this.array = new int[size];
    }

    public int getSize(){
        return this.array.length;
    }

    public int getSum(){
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public void fill(int e){
        for (int i = 0; i < array.length; i++) {
            array[i] = e + i;
        }
    }
}
