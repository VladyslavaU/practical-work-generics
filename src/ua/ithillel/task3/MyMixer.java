package ua.ithillel.task3;

import java.util.ArrayList;

public class MyMixer<T> {
    public T[] array;

    public MyMixer(T[] array) {
        this.array = array;
    }

    public void shuffle() {
        int range = this.array.length;
        int[] indexes = new int[range];
        ArrayList<Integer> check = new ArrayList<>();
        for (int i = 0; i < indexes.length; i++) {
            int number = newIndex(range);
            while (check.contains(number)) {
                number = newIndex(range);
            }
            check.add(number);
            indexes[i] = number;
        }
        T[] arrayToFill = this.array.clone();
        for (int i = 0; i < arrayToFill.length; i++) {
            arrayToFill[indexes[i]] = this.array[i];
        }
        this.array = arrayToFill;
    }

    public static int newIndex(int range) {
        return (int) ((Math.random() * (range)) + 0);
    }


}

