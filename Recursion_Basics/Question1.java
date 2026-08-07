/*

Question 1
Print Name N times using Recursion

Problem Description: 
Given an integer N, write a program 
to print your name N times.

*/

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String name = sc.next();

        PrintNtimes(1,name, n);

        sc.close();
    }

    static void PrintNtimes(int count , String name ,int n){
        if( count == n){
            return;
        }
        System.out.println(name);
         
        PrintNtimes(count+1, name, n);
    }
}
