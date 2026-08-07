
/*

Question 3

Sum of First N Numbers Given an integer N,
return the sum of first N natural numbers. 
Try to solve this using recursion.

*/

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(SumOfFirstN(n, 0, 0));
        

        sc.close();
    }
    
    static int SumOfFirstN(int n, int count, int sum ){
      

        if (n == 0) {
            return sum;
        }
        
        return SumOfFirstN(n-1 , count+1 ,sum + n);
    }
}
