package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    /*
        1. Дан непустой массив целых чисел длиной n и число k (0 < k <= n).
        Нужно вывести среднее значение для всех подмассивов длиной k, входящих в исходный массив.

        2. Сигнатура метода и пример входных и выходных данных:
        arr = [1 ,2 ,3, 5], k = 2
        res = [1.5, 2.5, 4]
     */
    public List<Double> selectK (ArrayList<Integer> source, int k){
        ArrayList<Double> result = new ArrayList<>();
        Double summ = 0.0;

        if (k <= source.size() && k > 1)
        {
            for (int i = 0; i < k; i++) {
                summ = summ + source.get(i);
            }
            result.add(summ / k);
//            while (end < source.size()){
//                summ = summ - source.get(start);
//                summ = summ + source.get(end);
//                result.add(summ / k);
//                start++;
//                end++;
//            }
            for (int i = 0; i < source.size() - k; i++) {
                summ = summ - source.get(i);
                summ = summ + source.get(i + k);
                result.add(summ / k);
            }
        }
        else {
            System.out.println("Incorrect K");
        }

        return result;
    }

}
