
/*

Question 1
Counting Frequencies of Array Elements

Given an array nums of size n which may contain duplicate elements.
Rreturn a list of pairs where each pair contains a unique element from the array 
and its frequency in the array.
You may return the result in any order, but each element must appear exactly once 
in the output.

*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // CountingArrayFrequency(arr, n);

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        Frequency(arr,n);

        sc.close();
    }

    // Brute force Approach
    static void CountingArrayFrequency(int[] arr, int n){

        boolean [] visited = new boolean[n];
        
        for (int i = 0; i < visited.length; i++) {
            if(visited[i]){
                continue;
            }
            int count = 1;

            for(int j = i+1; j < n; j++){
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            System.out.print("["+arr[i] + ", " + count + "]");

        }      
    }

    // Optimal Approach
    
    public static void Frequency(int [] arr, int n){

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }


        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
    }
}
