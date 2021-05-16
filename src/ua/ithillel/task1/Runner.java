package ua.ithillel.task1;

import java.util.Arrays;

public class Runner {

    public void run() {
        Integer[] ints = {1, 2, 3, 4, 5, 6, 6, 7, 8, 8, 9, 6, 5};
        Double[] doubles = {1.0, 3.25, 6.8, 7.9, 8.5};
        System.out.println("Array of integers: " + Arrays.toString(ints));
        System.out.println("CaclSum on Integers: ");
        System.out.println(MyTestMethod.calcSum(ints, 5));
        System.out.println("Array of doubles: " + Arrays.toString(doubles));
        System.out.println("CalcSum on Doubles");
        System.out.println(MyTestMethod.calcSum(doubles, 5));
    }
}
