import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Merge_Sort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        MergeSort(arr, 0, n-1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();



    }  

    static void MergeSort(int[] arr, int low, int high){
        if (low >= high) return ;
        int mid = (low+high)/2;
        MergeSort(arr, low, mid);
        MergeSort(arr, mid+1, high);
        Merge(arr,low,mid,high);

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();
    }

    static void Merge(int[]arr, int low, int mid, int high){
        int left = low;
        int right = mid+1;

        List<Integer> temp = new ArrayList<>();


        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left++]);
            }
            else{
                temp.add(arr[right++]);
            }
        }
        
        while (left <= mid) {
            temp.add(arr[left++]);
        }

        while (right <= high) {
            temp.add(arr[right++]);

        }

        for (int i = low; i <= high; i++){
            arr[i] = temp.get(i - low);
        }

    }
}