/*

    Question 2 : Arrays

    Second Largest Element

    Given an array of integers nums, return the second-largest element in the array. 
    If the second-largest element does not exist, return -1.

*/

import java.util.Scanner;

class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        SecondLargest(arr);

        sc.close();
    }

    static void SecondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        
        if (arr.length == 1) {
            secMax = -1;
            max = arr[0];
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
            else{
                if (arr[i] > secMax && arr[i] != max) {
                    secMax = arr[i];
            }
            }
        }

        System.out.println("Largest Element : " + max);

        System.out.println("Second Largest Element : " + secMax );
    }
}
