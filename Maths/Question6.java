
/*

Question 6
Divisors of a Number

You are given an integer n. 
You need to find all the divisors of n.
 Return all the divisors of n as an array or list 
in a sorted order.
A number which completely divides another number is 
called it's divisor.

*/

import java.util.ArrayList;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("the divisors of 8 are : "+ DivisorsNumber(n));

        sc.close();
    }

    public static ArrayList<Integer> DivisorsNumber(int n){


        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            if(n % i == 0){
                arr.add(i);
            }
        }

        return arr;
    }

}
