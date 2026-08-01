
import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n-i-1 ; j++){
                System.out.print(' ');
            }
            char ch = 'A';
            int breakpoint = (2 * i + 1)/2;

            for(int k = 0; k < 2 * i + 1 ; k++){

                System.out.print(ch);
                if(k < breakpoint) {
                    ch++;
                }
                else{
                    ch--;
                }

            }

            for(int j = 0 ; j < n-i-1 ; j++){
                System.out.print(' ');
            }

            System.out.println();
        }

        sc.close();

    }
}
