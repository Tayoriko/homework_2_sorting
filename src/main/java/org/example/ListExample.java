package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListExample {
    /*
        1. Дан непустой массив целых чисел длиной n и число k (0 < k <= n).
        Нужно вывести среднее значение для всех подмассивов длиной k, входящих в исходный массив.

        2. Сигнатура метода и пример входных и выходных данных:
        arr = [1 ,2 ,3, 5], k = 2
        res = [1.5, 2.5, 4]
     */
    public ArrayList<Double> selectK (ArrayList<Integer> source, int k){
        ArrayList<Double> result = new ArrayList<>();
        int start = 0;
        int end = 0;
        Double summ = 0.0;
        Double value = 0.0;

        if (k <= source.size() && k > 1)
        {
            end = k;
            while (end <= source.size()){
                for (int i = start; i < end; i++) {
                    summ = summ + source.get(i);
                }
                value = summ / k;
                result.add(value);
                summ = 0.0;
                start++;
                end++;
            }
        }
        else {
            System.out.println("Incorrect K");
        }

        return result;
    }

}
