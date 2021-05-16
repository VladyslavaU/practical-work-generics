package ua.ithillel.task3;

import java.util.Arrays;

public class Runner {

    public void run() {
        Integer[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        String[] strings = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
                "Thirteen", "Fourteen", "Fifteen"};
        MyMixer<Integer> integers = new MyMixer<>(ints);
        MyMixer<String> stringsToShuffle = new MyMixer<>(strings);
        System.out.println("Integers before shuffle: " + Arrays.toString(ints));
        integers.shuffle();
        System.out.println("Integers after shuffle: ");
        for (Integer number : integers.array) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("Strings before shuffle: " + Arrays.toString(strings));
        System.out.println("Strings after shuffle: ");
        stringsToShuffle.shuffle();
        for (String string : stringsToShuffle.array) {
            System.out.print(string + " ");
        }
    }
}
