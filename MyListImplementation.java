package listImplementation;

import java.util.Arrays;

public class MyListImplementation {
    private int counter;
    private int[] elements;
    public MyListImplementation(int list) {
        elements = new int[list];
    }

    public boolean myListIsEmpty() {
        return counter == 0;
    }

    public void add(int element) {
        elements[counter] = element;
        counter++;
    }


    public int[] getElements() {
        return elements;
    }

    public int removeElements() {
        counter--;
        return elements[counter];
    }
}

