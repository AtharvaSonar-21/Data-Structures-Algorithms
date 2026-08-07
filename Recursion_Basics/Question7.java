
/*

Fibonacci Number

The Fibonacci numbers, commonly denoted F(n) form a sequence,
 called the Fibonacci sequence, such that each number is the sum 
 of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.


Given n, calculate F(n).


*/

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("The Fibonacci Number is : "+FibonacciSeries(n-1));
        
        sc.close();
    }

    static int FibonacciSeries(int n){

        if(n <= 1){
            return n;

        }

        return FibonacciSeries(n-1)+ FibonacciSeries(n-2);
    }
}
