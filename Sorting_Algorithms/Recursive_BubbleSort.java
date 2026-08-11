
/*

Recursive Bubble Sort

Given an array of integers nums, sort the array in non-decreasing order 
using the recursive Bubble Sort algorithm, and return the sorted array.

You must implement Bubble Sort using recursion only.
Do not use built-in sorting functions (sort, sorted, Arrays.sort, etc.).
A sorted array in non-decreasing order is an array where each element is greater 
than or equal to the previous one.

*/

import java.util.Scanner;

class Recursive_BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Before Using Bubble Sort:");
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();


        ReBubbleSort(arr, n);

        System.out.println("After Using Bubble Sort:");
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();

        sc.close();
    }

    static void ReBubbleSort(int[] arr, int n){
        if (n == 1) {
            return;
        }
        
        for(int i = 0 ; i < n-1;  i++){

            if(arr[i] > arr[i+1]){
                arr[i] ^= arr[i+1];
                arr[i+1] ^= arr[i];
                arr[i] ^= arr[i+1];


            }
        }

        ReBubbleSort(arr, n-1);
    }
}
