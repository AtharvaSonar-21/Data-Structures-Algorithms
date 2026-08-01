import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = 1;
        for (int i = 0; i < n; i++) {
            for (int j = n+1; j > n-i; j--) {
                System.out.print(a++);
                System.out.print(" ");
            }
            System.out.println();
        }        


        sc.close();
    }
}
