package org.example.basics;

import java.util.ArrayList;
import java.util.List;

public class Sort {

    /*
    Swap two numbers.
     */
    public static void swap(List<Integer> list, int i, int j){
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
    /*
    Bubble sort
    -> highly Inefficient, but easy to understand.
    -> No of swaps happening in the program is higher because the swapping is happening inside the inner loop.
    */
    public static void bubbleSort(List<Integer> list) {
        for(int i=0; i< list.size(); i++){
            for(int j=0; j<list.size()-i-1; j++){
                if(list.get(j)> list.get(j+1)){
                    swap(list, j, j+1);
                }
            }
        }
    }
    /*
    Selection sort
    -> Slightly better than bubble sort, easy to understand
    -> Swapping is happening outside the inner loop, resulting in fewer swaps. Slightly better but still inefficient.
     */
    public static void selectionSort(List<Integer> list){
        for(int i=0; i<list.size(); i++){
            int smallest = i; // Stores the index of the smallest value
            for(int j=i+1; j<list.size(); j++){
                if(list.get(smallest) > list.get(j)){
                    smallest = j;
                }
            }
            if(smallest != i) {
                swap(list, i, smallest);
            }
        }
    }
    /*
    Insertion sort
    -> Better than most(selection sort, bubble sort, ...).
    -> Swapping isn't used in here.
    -> Shifting.
     */
    public static void insertionSort(List<Integer> list){
        int size = list.size();
        for(int i=1; i<size; i++){
            int key = list.get(i);
            int j = i-1;
            while(j>=0 && list.get(j) > key){
                list.set(j+1, list.get(j));
                j--;

            }
            list.set(j+1, key);

        }
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(22, 44, 64, 33, 13, 66, 74, 32, 65, 90));
        System.out.println("Before sorting: " + list);
        insertionSort(list);
        System.out.println("After sorting: " + list);

    }
}
