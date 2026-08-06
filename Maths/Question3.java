import java.util.Scanner;

/**
 * Question3
 * Palindrome Number
    You are given an integer n. You need to check whether the number is a palindrome number or not. 
    Return true if it's a palindrome number, otherwise return false.
    A palindrome number is a number which reads the same both left to right and right to left.
 * 
 */
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("The Number is Palindrome : " + Palindrome(n));
    }

    public static boolean Palindrome(int x){
        int org = x;
        int rev = 0;
        while (x > 0 ) {
            int rem = x % 10;

            rev = rev * 10 + rem;

            x/= 10;
        }

        if (org == rev) {
            return true;
        }
        return false;


    }
    
}