package com.example.sorting;

public class SortingUtility {


    public static <T extends Comparable<T>> void gnomeSort(T[] data) {

        int position = 0;

        while (position < data.length) {
            if (position == 0 || data[position].compareTo(data[position -1]) >= 0){
                position++;
            } else {
                T temp = data[position];
                data[position] = data[position - 1];
                data[position - 1] = temp;
                position--;
            }
        }
    }


    public static <T extends Comparable<T>> void cocktailShakerSort(T[] data) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i].compareTo(data[i + 1]) > 0) {

                    T temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;

                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }

            swapped = false;

            for (int i = data.length - 1; i > 0; i--) {
                if (data[i].compareTo(data[i - 1]) < 0) {
                    T temp = data[i];
                    data[i] = data[i - 1];
                    data[i - 1] = temp;

                    swapped = true;
                }
            }
        }while (swapped) ;
    }




    public static <T extends Comparable<T>> void shellSort(T[] data) {

        System.out.println("Didn't do");

        /*
        int[] gaps = {701, 301, 132, 57, 23, 10, 4, 1};
        int n = data.length;
        foreach(){
            for (int i = gap; i < n; i+=1){
                for ( int j = i; )
            }
        }
        */

    }

    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }
}





