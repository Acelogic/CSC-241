package Coursework.Algorithms.Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerSelectionSort {

    private ArrayList<Integer> list;

    public IntegerSelectionSort(ArrayList<Integer> list) {
        this.list = list;
    }

    public ArrayList<Integer> unsortedList() {
        return list;
    }

    // Max Value of whole list
    public int maxValue() {
        int currentMax = list.get(0);
        for (Integer maxCandidate : list) {
            if (currentMax < maxCandidate) {
                currentMax = maxCandidate;
            }
        }
        return currentMax;
    }


    // Max Value within a scope
    public int maxValue(int index1, int index2) {
        Integer currentMax = list.subList(index1, index2).get(0);
        System.out.println("First Max: " + currentMax);
        for (int i = 1; i < list.subList(index1, index2).size(); i++) {
            int maxCandidate = list.subList(index1, index2).get(i);
            if (currentMax < maxCandidate) {
                currentMax = maxCandidate;
                System.out.println("Current Max: " + currentMax);
            }
        }
        return currentMax;
    }


    public ArrayList<Integer> sort() {
        for (int i = 1; i < list.size(); i++) {
            System.out.println("--------------------------------------------");
            System.out.println("Size: " + (list.size() - i));
            System.out.println("Sub List: " + list.subList(0, list.size() - i));
            int position1 = list.indexOf(maxValue(0, (list.size() - i) +1));
            int position2 = list.size() -i;
            Collections.swap(list, position1, position2);
        }
        return list;
    }


}