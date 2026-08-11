
/*
    Question 1 : Arrays

    Largest Element

    Given an array of integers nums, 
    return the value of the largest element in the array

*/

import java.util.Scanner;

class Question1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();    
        }


        System.out.println( "The Largest Element is : " + LargestElement(arr));
    
        sc.close();
        
    }

    static int LargestElement(int[] arr){
        int max = 0;
        int n = arr.length;

        if (n == 1) {
            return arr[0];
        }

        for (int i = 0; i < n; i++) {

            if (arr[i] > max) {
                max = arr[i];    
            }
        }

        return max;
    }
}
