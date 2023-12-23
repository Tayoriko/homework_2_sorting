package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class CollectionsTest {

    Collections collect = new Collections();

    @Test
    void swapHashMapTest() {
        HashMap<Integer, String> source = new HashMap<>();
        HashMap<String, Integer> result = new HashMap<>();
        source.put(10, "Anna");
        source.put(11, "Vadim");
        source.put(12, "Oleg");
        result = collect.swapHashMap(source);

        System.out.println("Исходные данные: ");
        for (Map.Entry<Integer, String> entry : source.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
        }

        System.out.println("Результат операции: ");
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
        }

    }

    @Test
    void arrayListTimeCheck() {
        //67 ms
        collect.arrayListTimeCheck();
    }

    @Test
    void linkedListTimeCheck() {
        //2 sec 331 ms
        collect.linkedListTimeCheck();
    }

    @Test
    void getUniqueFromArray() {
        ArrayList<String> source = new ArrayList<>();
        source.add("Annd");
        source.add("Oleg");
        source.add("Pikadillo");
        source.add("Annd");
        source.add("Oleg");

        System.out.println("Исходный массив: ");
        for (String element : source){
            System.out.println(element);
        }

        source = collect.getUniqueFromArray(source);
        System.out.println("Преобразованный массив: ");
        for (String element : source){
            System.out.println(element);
        }
    }
}