package Coursework.Algorithms.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Sorter {


    public Sorter() {

    }

    // insertion Sort
    public int insertionSort(int[] data) {
        int i, j, item, count;
        // initialize count
        count = 0;
        for (i = 1; i < data.length; i++) {
            // select item to place
            item = data[i];
            j = i;
            while (j > 0 && data[j - 1] > item) {
                // continue shifting items until correct position is found
                data[j] = data[j - 1];
                j--;
                count++;  // increment shift count
            }
            data[j] = item; // place item in correct location
        }
        return count;
    }


    // Quick Sort
    public int quickSort(int[] data, int first, int last) {
        int left, right, pivot, count;
        // initialize count
        count = 0;
        if (first >= last) {
            return count;
        }
        left = first;
        right = last;
        // chose a pivot between the left and right
        pivot = data[(first + last) / 2];
        do {
            // Find a left value in the wrong place
            while (data[left] < pivot) {
                left++;
            }
            // Find a right value in the wrong place
            while (data[right] > pivot) {
                right--;
            }
            // swap the values
            if (left <= right) {
                count++;  // increment the swap count
                // swap the values
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }
        }
        while (left <= right);
        // Recursive call Quick Sort on the left and right sub arrays
        int rCount = quickSort(data, first, right);
        int lCount = quickSort(data, left, last);
        // return the total swap count
        return count + rCount + lCount;
    }



    public static void main(String[] args) {
        int[] inputArray = new int[5000000];

        Random r = new Random();
        // initialize with random numbers
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = r.nextInt(inputArray.length);
        }
        //show unsorted
        System.out.println("---=== Unsorted ===---");
        System.out.println(Arrays.toString(inputArray));

        // create a Sorter
        Sorter s = new Sorter();
        int count;
        count = s.insertionSort(inputArray);
        //count = s.quickSort(inputArray, 0, inputArray.length - 1);

        // show sorted
        System.out.println("---=== Sorted ===---");
        System.out.println(Arrays.toString(inputArray));


        System.out.println();
        System.out.println("The count was: " + count);



    }
}

