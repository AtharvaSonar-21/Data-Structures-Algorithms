
/*
Question 2
Print N to 1 using Recursion
Given an integer n, write a function to print all numbers from n to 1 (inclusive) using recursion.
You must not use any loops such as for, while, or do-while.
The function should print each number on a separate line, in decreasing order from n to 1

*/

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();



        PrintNto1(n);
    }

    static void PrintNto1(int n){

        if(n == 0){
            return;
        }
        System.out.println(n);
        
        PrintNto1(n-1);
    }
}


