package org.example.strategy.example;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3};
        Arrays.sort(array);

        Arrays.sort(array, Comparator.reverseOrder());
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, Comparator.naturalOrder());
        System.out.println(Arrays.toString(array));
    }
}
