package ua.ithillel.task3;

public class MyMixer<T> {
    private T[] array;

    public MyMixer(T[] array) {
        this.array = array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return this.array;
    }

    public void shuffle() {
        int range = this.array.length;
        for (int i = 0; i < this.array.length; i++) {
            int index = newIndex(range);
            T temp = this.array[index];
            this.array[index] = this.array[i];
            this.array[i] = temp;
        }
    }

    private static int newIndex(int range) {
        return (int) ((Math.random() * (range)) + 0);
    }


}

