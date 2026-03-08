package c_arrays.a_easy.h_unionOfTwoSortedArrays;

import java.util.*;

public class solution {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 4, 5};
        union_rev(arr1, arr2);
    }

    private static void union(int[] arr1, int[] arr2) {
        //we're using TreeSet and not HashSet because TreeSet is sorted automatically
        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int j = 0; j < arr2.length; j++) {
            set.add(arr2[j]);
        }

        for (int num : set) {
            System.out.println(num);
        }
    }

    //Optimal Two pointer solution (similar to merge sort)
    private static void union_optimal(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length, i = 0, j = 0;

        List<Integer> union = new ArrayList<>();
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            } else {
                if (union.isEmpty() || union.getLast() != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        while (i < n) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        while (j < m) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        for (int num : union) {
            System.out.println(num);
        }
    }

    private static void union_rev(int[] arr1, int[] arr2) {
        int p1 = 0, p2 = 0;
        List<Integer> temp = new ArrayList<>();
        while (p1 < arr1.length && p2 < arr2.length) {
            if (arr1[p1] < arr2[p2]) {
                if (temp.isEmpty() || arr1[p1] != temp.getLast()) {
                    temp.add(arr1[p1]);
                }
                p1++;
            } else if (arr1[p1] > arr2[p2]) {
                if (temp.isEmpty() || arr2[p2] != temp.getLast()) {
                    temp.add(arr2[p2]);
                }
                p2++;
            } else if (arr1[p1] == arr2[p2]) {
                if (temp.isEmpty() || arr1[p1] != temp.getLast()) {
                    temp.add(arr1[p1]);
                }
                p1++;
                p2++;
            }
        }

        while (p1 < arr1.length) {
            if (temp.isEmpty() || arr1[p1] != temp.getLast()) {
                temp.add(arr1[p1]);
            }
            p1++;
        }

        while (p2 < arr2.length) {
            if (temp.isEmpty() || arr2[p2] != temp.getLast()) {
                temp.add(arr1[p1]);
            }
            p2++;
        }

        for (int i : temp) {
            System.out.println(i);
        }
    }

}
