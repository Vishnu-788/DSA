package org.example.basics;

import java.util.ArrayList;
import java.util.List;

public class Search {
    public static int linearSearch(List<Integer> list, int target){
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == target){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(List<Integer> list, int target){
        int start = 0;
        int end = list.size()-1;
        while(start <= end){
            int mid = (start + end)/2;
            int mid_value = list.get(mid); // for debugging
            if(mid_value == target){
                return mid;
            } else if(mid_value < target){
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(List<Integer> list, int target, int start, int end){
        if(start >= end) { // exit call if element not found
            return -1;
        }
        int mid = (start + end)/2;
        int mid_value = list.get(mid); // for debugging
        if(mid_value == target){
            return mid;
        } else if(mid_value < target){
            start = mid + 1;
            return recursiveBinarySearch(list, target, start, end);
        } else {
            end = mid - 1;
            return recursiveBinarySearch(list, target, start, end);
        }
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(20);
        list.add(21);
        list.add(22);
        list.add(27);


        System.out.println("Array:  " + list);
        System.out.println("Searching for element...");
        int i = recursiveBinarySearch(list, 9, 0, list.size()-1);
        if(i>=0){
            System.out.println("Element found at position: " + (i+1));
        } else {
            System.out.println("Element not found");
        }

    }
}