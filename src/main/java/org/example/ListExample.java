package org.example;

import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.List;

public class ListExample {
    /*
        1. Дан непустой массив целых чисел длиной n и число k (0 < k <= n).
        Нужно вывести среднее значение для всех подмассивов длиной k, входящих в исходный массив.

        2. Сигнатура метода и пример входных и выходных данных:
        arr = [1 ,2 ,3, 5], k = 2
        res = [1.5, 2.5, 4]

        while (end < source.size()){
            summ = summ - source.get(start);
            summ = summ + source.get(end);
            result.add(summ / k);
            start++;
            end++;
       }
     */
    public List<Double> selectK (ArrayList<Integer> source, int k){
        ArrayList<Double> result = new ArrayList<>();
        double summ = 0.0;
        boolean exception = false;

        //check for exceptions
        try {
            //ckeck K
            if (k <= 0){
                throw new IllegalArgumentException("selectK input argument 'k' is incorrect (<=0)");
            }
            //check List == Null
            if (source == null){
                throw new NullPointerException("selectK input List is Null");
            }
            //check size of List and K
            if (source.isEmpty() || source.size() < k){
                throw new IllegalArgumentException("selectK input List has incorrect size less then 'k' or empty");
            }
        }
        catch (NullPointerException e){
            System.out.println("Find null exception: " + e.getMessage());
            exception = true;
        } catch (IllegalArgumentException e) {
            System.out.println("Find illegal argument exception: " + e.getMessage());
            exception = true;
        }

        //main
        if (!exception) {
            //calc first window
            for (int i = 0; i < k; i++) {
                summ = summ + source.get(i);
            }
            result.add(summ / k);
            //calc next windows
            for (int i = 0; i < source.size() - k; i++) {
                summ = summ - source.get(i);
                summ = summ + source.get(i + k);
                result.add(summ / k);
            }
        }
        return result;
    }

}
