package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class CollectionsTest {

    Collections collect = new Collections();

    @Test
    //проверка валидной Map
    void swapHashMapTest_1() {
        HashMap<Integer, String> source = new HashMap<>();
        HashMap<String, Integer> result;
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
    //проверка Map null
    void swapHashMapTest_2(){
        HashMap<Integer, String> source = null;
        HashMap<String, Integer> result;
        result = collect.swapHashMap(source);
    }

    @Test
    //проверка Map empty
    void swapHashMapTest_3(){
        HashMap<Integer, String> source = new HashMap<>();
        HashMap<String, Integer> result;
        result = collect.swapHashMap(source);
    }

    @Test
    //проверка Map c дубликатами
    void swapHashMapTest_4(){
        HashMap<Integer, String> source = new HashMap<>();
        HashMap<String, Integer> result;
        source.put(10, "Anna");
        source.put(11, "Anna");
        source.put(12, "Oleg");
        result = collect.swapHashMap(source);
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

        collect.getUniqueFromArray(source);
        System.out.println("Преобразованный массив: ");
        for (String element : source){
            System.out.println(element);
        }
    }
}