/*

    Question 3 : Arrays

    1752. Check if the Array is Sorted And Rotated (Leetcode)

    Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

    There may be duplicates in the original array.

    Note: An array A rotated by x positions results in an array B of the same length such that B[i] == A[(i+x) % A.length] for every valid index i.



*/

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }


        System.out.println(CheckSortedOrRotated(arr));
        

        sc.close();
    }

    public static boolean CheckSortedOrRotated(int[] arr){

        int count = 0;
        int n =arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[(i+1) % n]) {
                count++;
            }
        }

        return count <= 1;

        // int count = 0;
        // for (int i = 1; i < arr.length; i++) {
        //     if (arr[i-1] < arr[i]) {
        //         count++;
        //     }
        // }

        // if (count == arr.length-1) {
        //     return true;    
        // }

        // return false;
    }
}
