/*
Selection Sort

*/

import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        selectionSort(arr);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();

    }
    
    static void selectionSort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < arr.length-1 ; i++) {

            int min_idx = i;

            for (int j = i+1 ; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx  = j;
                }
            }

            // Swapping logic with temp variable

            // int temp = arr[i];

            // arr[i] = arr[min_idx];

            // arr[min_idx] = temp;


            // Swaping Logic with Bitwise operator

            arr[i] = arr[i] ^ arr[min_idx];
            arr[min_idx] = arr[min_idx] ^ arr[i];
            arr[i] = arr[i] ^ arr[min_idx];

        }        
    }
}
