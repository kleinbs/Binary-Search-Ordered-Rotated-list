package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] sortedList = new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3, 4};

        System.out.println("Brute Force");
        System.out.println("The smallest element is: " + findSmallest(sortedList));

        System.out.println("Binary Search");
        System.out.println("The smallest element is: " + findSmallestBinary(sortedList, 0, sortedList.length - 1));
    }

    private static int findSmallest(int[] sortedList)
    {
        int smallest = sortedList[0];

        for(int i = 1; i < sortedList.length; i++)
        {
            if(sortedList[i] < smallest)
                smallest = sortedList[i];
        }

        return smallest;
    }

    private static int findSmallestBinary(int[] sortedList, int min, int max)
    {

        while (sortedList[min] > sortedList[max]) {
            int mid = (min + max) >>> 1; ///Kewl trick for dividing a number by 2
            if (sortedList[mid] > sortedList[max]) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        return min;

    }
}
