
/*

Question 7

Check for Prime Number

You are given an integer n. 
You need to check if the number is prime or not. 
Return true if it is a prime number, otherwise return false.
A prime number is a number which has no divisors except 1 and itself.

*/

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        System.out.println(PrimeOrNot(n));      
        
    }

    static boolean PrimeOrNot(int n){
        int count = 0;

        if(n == 1){
            return false;
        }
        for (int i = 1; i <= n/2; i++) {
            if( n % i == 0){
                count++;
            }
        }

        if(count == 1){
            return true;
        }

        return false;
    }
}
