package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ListExampleTest {

    ListExample medianCalc = new ListExample();

    @Test
    void selectK() {
        ArrayList<Integer> source = new ArrayList<Integer>();
        ArrayList<Double> result = new ArrayList<Double>();
        source.add(1);
        source.add(2);
        source.add(3);
        source.add(5);

        System.out.println("Исходный массив: " + Arrays.toString(source.toArray()));

        int k = 2;

        System.out.println("K = " + k);

        result = medianCalc.selectK(source, k);

        System.out.println("Результат метода: " + Arrays.toString(result.toArray()));

    }
}