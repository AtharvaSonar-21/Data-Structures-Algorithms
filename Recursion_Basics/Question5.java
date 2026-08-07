/*


Question 5
Reverse an array

Given an array arr of n elements. 
The task is to reverse the given array. 
The reversal of array should be inplace.

*/

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        ReverseArr(arr, n-1, 0);

        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }


        sc.close();
    }

    static void ReverseArr(int[] arr, int n, int start){

        if (start >= n) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[n];
        arr[n] = temp;

        ReverseArr(arr, n-1 , start+1);
        
    }
}
