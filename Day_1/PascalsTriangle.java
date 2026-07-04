package Day_1;

import java.util.List;
import java.util.ArrayList;

public class PascalsTriangle {
    
    public List<List<Integer>> generate(int numRows) {
        int n = numRows;
        List<List<Integer>> ans = new ArrayList<>(n);
        
        for(int i = 0 ; i < n; i++){
            List<Integer> row = new ArrayList<>();

            for(int j = 0; j <= i ; j++){

                if(j == 0 || j == i ){
                    row.add(1);
                }
                else{
                    List<Integer> prevRow = ans.get(i - 1);
                    int value = prevRow.get(j - 1) + prevRow.get(j);
                    row.add(value);
                }
            }
            ans.add(row);
        }
        return ans;
    }
}