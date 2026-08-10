
/*

Insertion Sort

*/


import java.util.Scanner;

public class Insertion_Sort {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        insertionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

    static void insertionSort(int[] arr){
        
        for (int i = 1; i < arr.length; i++) {
            int min = arr[i];
            int j = i - 1;

             while (j >= 0 && arr[j] > min) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = min;

        }
            
    }

}
