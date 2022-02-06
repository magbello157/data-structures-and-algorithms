package com.magbello157;

import java.util.Arrays;

public class Array {
    private int[] array;
    private int currentIndex = 0;

    public Array(int length) {
        array = new int[length];
    }

    public void insert(int item) {
        if (currentIndex < array.length) {
            array[currentIndex] = item;
            currentIndex++;
        } else {
            int[] oldArray = array;
            array = new int[currentIndex + 1];

            for (int i = 0; i < oldArray.length; i++)
                array[i] = oldArray[i];

            array[currentIndex] = item;
            currentIndex++;
        }
    }

    public void removeAt(int rm_index) {
        if (rm_index >= 0 && rm_index < array.length) {
            int[] oldArray = array;
            array = new int[oldArray.length - 1];

            for (int i = 0, k = 0; i < oldArray.length; i++) {
                if (i == rm_index)
                    continue;

                array[k++] = oldArray[i];
            }
        } else {
            System.out.println("Invalid removal index " + rm_index);
        }
    }

    public int indexOf(int number) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == number)
                return i;

        return -1;
    }

    public void print() {
        System.out.println(Arrays.toString(array));
    }
}
