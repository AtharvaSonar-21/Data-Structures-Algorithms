/*

Question 4
GCD of Two Numbers

You are given two integers n1 and n2. 
You need find the Greatest Common Divisor (GCD) of the two given numbers.
Return the GCD of the two numbers.
The Greatest Common Divisor (GCD) of two integers is the largest 
positive integer that divides both of the integers.

*/

import java.lang.reflect.GenericDeclaration;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The GCD of "+ a + " & "+ b + " is : " + GCD(a,b) );
        
        sc.close();
    }

    static int GCD(int x, int y){
        
        while (x != y) {
            if (x > y) {
                x -= y;
            } else {
                y -= x;
            }
        }

        return x;
    }
}
