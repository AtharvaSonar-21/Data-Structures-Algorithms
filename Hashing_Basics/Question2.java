
/*
Question 2

Highest Occurring Element in an Array

Given an array nums of n integers, find the most frequent element in it i.e., 
the element that occurs the maximum number of times. 
If there are multiple elements that appear a maximum number of times, find the smallest of them.

Please note that this section might seem a bit difficult without prior knowledge on what hashing is, 
we will soon try to add basics concepts for your ease! If you know the concepts already please go ahead 
to give a shot to the problem. Cheers!

*/

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the element of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HighestOccuringElement(arr);

        sc.close();


    }

    static void HighestOccuringElement(int[] arr){

        int n = arr.length;

        if (n == 0) {
            System.out.println("Array is Empty");
            return;
        }

        int maxFreq = 0, minFreq = n;

        int maxEle = 0, minEle = 0;

        boolean[] visited = new boolean[n];

        for(int i = 0 ; i < n ; i++){

            if (visited[i]) {
                continue;
            }

            int count = 1;

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            if (count > maxFreq) {
                maxEle = arr[i];
                maxFreq = count;
            }

            if (count < minFreq) {
                minEle = arr[i];
                minFreq = count;
            }

        }

        System.out.println("The Highest Frequency element is : " + maxEle);

    }
}
