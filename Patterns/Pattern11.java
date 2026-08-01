import java.util.Scanner;

/**
 * Pattern11
 */

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        

        for (int i = 1; i <= n ; i++){
            int start = (i % 2 != 0) ? 1 : 0;

            for (int j = 0; j < i ; j++){
                System.out.print(start + " ");

                start = 1 - start;
            }
            System.out.println();

        }
        sc.close();
    }
    
}