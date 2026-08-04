
/* 

Question 2 : Reverse a number
You are given an integer n. 
Return the integer formed by placing the digits of n in reverse order.

*/

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long rev = 0;

        while(n != 0 ){
            int lastdigit = n % 10;

            rev = rev * 10 + lastdigit;

            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE ){
                System.out.print(0);
                break;
            }
            n /= 10;
        }
        System.out.print(rev);
        
    }
}
