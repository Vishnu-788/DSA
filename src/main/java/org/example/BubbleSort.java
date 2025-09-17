package org.example;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
    public static void bubleSort(List<Integer> list) {
        for(int i=0; i< list.size(); i++){
            for(int j=0; j<list.size()-i-1; j++){
                if(list.get(j)> list.get(j+1)){
                    int temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(22, 44, 64, 33, 13, 66, 74, 32, 65, 90));
        System.out.println("Before sorting: " + list);
        bubleSort(list);
        System.out.println("After sorting: " + list);

    }
}
