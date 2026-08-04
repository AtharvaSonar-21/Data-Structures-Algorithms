import java.util.Scanner;

/*
Question 1 : Count all Digits of a Number

You are given an integer n. You need to return the number of digits in the number.
The number will have no leading zeroes, except when the number is 0 itself.

*/

public class Question1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        if (n == 0) {
            System.out.println(1);
        }
        else if(n < 0){
            System.out.println(0);
        }

        while( n >= 0){
            count++;
            n /= 10;
        }
        System.out.print(count);

        sc.close();
    }
}
