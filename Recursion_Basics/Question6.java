/*

Question 6
Check if String is Palindrome or Not

Given a string s, return true if the string is palindrome, otherwise false.
A string is called palindrome if it reads the same forward and backward.

*/

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println("The String is Palindrome : "+ CheckPalindromeOrNot(str, 0, str.length()-1));
        
    }

    static boolean CheckPalindromeOrNot(String str, int s, int e){

        if (s >= e) {
            return true;
        }

        if (str.charAt(s) != str.charAt(e)) {
            return false;
        }

        return CheckPalindromeOrNot(str, s+1, e-1);
    }
}
