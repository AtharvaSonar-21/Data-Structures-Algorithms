/*

Quick Sorting


*/

import java.util.Scanner;

public class Quick_Sort {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, n-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] +" ");
        }

        sc.close();
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            
            int pindex = partition(arr, low, high);

            quickSort(arr, low, pindex - 1);
            quickSort(arr, pindex + 1, high);
        }
    }

    static int partition(int[] arr , int low , int high){
        int pivot = arr[high];

        int i = low -1;

        for (int j = low ; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr,i+1,high);

        return i+1;
    }

    static void swap(int[] arr, int i, int j){
        if (i != j) {
            arr[i] ^= arr[j];
            arr[j] ^= arr[i];
            arr[i] ^= arr[j];    
        }
        
    }
}
