package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class SortMethodsTest {

    SortMethods sort = new SortMethods();
    int[] test_1 = new int[1000];
    int[] test_2 = new int[10000];
    int[] test_3 = new int[100000];
    Random random = new Random();

    public int[] generate(int[] test){
        for (int i = 0; i < test.length; i++) {
            test[i] = random.nextInt(test.length * 10);
        }
        return test;
    }

    @Test
    void sortBubles() {
        int[] source = generate(test_3);
        int[] result = sort.sortBubles(source);
        System.out.println(Arrays.toString(result));
    }

    @Test
    void sortInsert() {
        int[] source = generate(test_3);
        int[] result = sort.sortInsert(source);
        System.out.println(Arrays.toString(result));
    }

    @Test
    void sortSelect() {
        int[] source = generate(test_3);
        int[] result = sort.sortSelect(source);
        System.out.println(Arrays.toString(result));
    }

    @Test
    void sortArray() {
        int[] source = generate(test_3);
        Arrays.sort(source);
        System.out.println(Arrays.toString(source));
    }
}