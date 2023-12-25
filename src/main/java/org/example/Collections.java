package org.example;

import java.util.*;

public class Collections {
    /*
        Задание 1: Реализуй метод, который поменяет ключи и значения в HashMap местами. На вход в метод поступает
        HashMap<Interger, String>, надо вернуть HashMap<String, Integer>. Выведи результат.
     */
    public HashMap<String, Integer> swapHashMap (HashMap<Integer, String> source){
        HashMap<String, Integer> result = new HashMap<>();
        //проверки входного массива
        try {
            //проверка на null
            if (source == null){
                throw new NullPointerException("Input Map is null");
            }
            //проверка на наличие значение
            else if (source.isEmpty()){
                throw new RuntimeException("Input Map is Empty");
            }
            //Map допущен к дальнейшей обработке
            else {
                //проверка на наличие дубликатов
                HashSet<String> uniqueValues = new HashSet<>();
                boolean checkDoubleValues = false;
                for (String value : source.values()){
                    if(!uniqueValues.add(value)){
                        checkDoubleValues = true;
                        break;
                    }
                }
                //дубликаты обнаружены
                if (checkDoubleValues){
                    throw new RuntimeException("Input map has doubled values");
                }
                //выполнение задачи, если пройдены все проверки и не найдены дубликаты
                for (Integer key : source.keySet()){
                    result.put(source.get(key), key);
                }
            }
        } catch (NullPointerException e){
            System.out.println("Find null exception: " + e.getMessage());
        } catch (RuntimeException e){
            System.out.println("Find runtime exception: " + e.getMessage());
        }
        return result;
    }

    /*
        Задание 2: Реализуй метод, в котором создаются ArrayList, LinkedList и заполняются 1 000 000 случайными
        элементами одного и того же типа. После из ArrayList и LinkedList 1000 раз выбираем элемент по случайному индексу.
        Замерь время для ArrayList и LinkedList. Сравни результаты и предположи, почему они могут отличаться.
     */
    public void arrayListTimeCheck (){
        ArrayList<Integer>  list = new ArrayList<>();
        Random random = new Random();
        //add data to array list
        for (int i = 0; i < 1000000; i++) {
            list.add(random.nextInt(1000000));
        }
        //get data from array list
        for (int i = 0; i < 1000; i++) {
            list.get(random.nextInt(1000000));
        }
    }
    public void linkedListTimeCheck (){
        LinkedList<Integer>  list = new LinkedList<>();
        Random random = new Random();
        //add data to array list
        for (int i = 0; i < 1000000; i++) {
            list.add(random.nextInt(1000000));
        }
        //get data from array list
        for (int i = 0; i < 1000; i++) {
            list.get(random.nextInt(1000000));
        }
    }

    /*
        Задание 3: Реализуй метод, который на вход примет ArrayList строк и удаляет из него все дубликаты,
        не используя метод contains(). Можно использовать другие коллекции, которые были изучены на уроке.
     */
    public void getUniqueFromArray(ArrayList<String> source){
        HashSet<String> hashSet = new HashSet<>();
        for (String element : source){
            hashSet.add(element);
        }
        source.clear();
        source.addAll(hashSet);
    }
}
