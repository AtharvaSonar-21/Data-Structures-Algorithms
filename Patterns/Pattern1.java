public class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
// method 1

        for(int i = 0 ; i < n ; i++){
            for(int j = 0; j < n ; j++){
                System.out.print('*');
            }
            System.out.println(" ");
        }
        // method 2

        int i = 0;

        while(i < n){
            System.out.println('*');
            i++;
        }
    }
}
