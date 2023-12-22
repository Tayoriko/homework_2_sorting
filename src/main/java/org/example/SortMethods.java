package org.example;
/*
    Sorting methods
 */
public class SortMethods {

    /*
        Method 1: Bubles sorting
     */
    public int[] sortBubles(int[] source){
        //stage 1
        //проходимся каждый раз по всему массиву, проме последнего элемента
        for (int i = 0; i < source.length - 1; i++) {
            //stage 2
            //для каждого элемента начиная с первого сравниванием его с предыдщим элементом
            //если он текущий элемент меньше, то меняем элементы местами и сравниваем снова
            //игнорируем элементы в конце массива, которые уже стоят на своих местах
            for (int j = 1; j < source.length-i; j++) {
                if (source[j-1] > source[j])
                {
                    int tmp = source[j];
                    source[j] = source[j-1];
                    source[j-1] = tmp;
                }
            }
        }
        //return sorted array
        return source;
    }

    /*
        Method 2: Insertion sorting
     */
    public int[] sortInsert(int[] source){
        //stage 1
        //проходим по массиву и буферизуем значение
        for (int i = 1; i < source.length; i++) {
            int value = source[i];      //буферизуем значение
            int j = i - 1;              //вычисляем смещение
            while (j >= 0 && source[j] > value){
                //пока смещение идёт от выбранного элемента к началу массива
                //и пока смещённое значение больше буферизованного
                source[j+1] = source[j];    //берём и смещаем всё подряд на похер, пока смещённое значение больше буфера
                j--;                        //и уменьшаем смещение, приближаясь к началу массива
            }
            source[j+1] = value;            //запихиваем буфер в точку, на которой оборвалось сравнение буфера со смещенным значнием
        }
        return source;
    }

    /*
        Method 3: Selection sort
     */
    public int[] sortSelect(int[] source) {
        //stage 1
        for (int i = 0; i < source.length - 1; i++) {
            int minElement = i;
            for (int j = i + 1; j < source.length; j++) {
                if (source[minElement] > source[j]) {
                    minElement = j;
                }
            }
            //stage 2
            if (minElement != i) {
                int value = source[i];
                source[i] = source[minElement];
                source[minElement] = value;
            }
        }
        return source;
    }
}
