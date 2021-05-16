package ua.ithillel.task1;

public class MyTestMethod {

    public static <T extends Comparable<T>> int calcNum(T[] array, T value) {
        int total = 0;
        for (T number : array) {
            if (number.compareTo(value) > 0) {
                total++;
            }
        }
        return total;
    }

    public static <T extends Number> double calcSum(T[] array, T value) {
        double sum = 0;
        for (T t : array) {
            if (!(t == null)) {
                if (t.doubleValue() > value.doubleValue()) {
                    sum += t.doubleValue();
                }
            }
        }
        return sum;
    }
}

