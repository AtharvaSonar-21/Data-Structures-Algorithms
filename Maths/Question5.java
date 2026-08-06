/*

Question 5
Check if the Number is Armstrong

You are given an integer n. 
You need to check whether it is an armstrong number or not.
Return true if it is an armstrong number, otherwise return false.
An armstrong number is a number which is equal to the sum of the
digits of the number, raised to the power of the number of digits.

*/

import java.util.Scanner;

class Question5{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("the Number is ArmStrong : "+ CheckArmStrong(n));
        
    }

    public static boolean CheckArmStrong(int n){
        int org = n;
        int sum = 0;

        while (n != 0) {
            int ld = n % 10;

            int sq = ld * ld * ld;

            sum = sum + sq;

            n/=10;
        }

        if(sum == org){
            return true;
        }

        return false;
    }
}