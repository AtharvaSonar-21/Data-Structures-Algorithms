
/**
 * SetMatrixZeros
 * 
 * Given an m x n integer matrix matrix, 
 * if an element is 0, set its entire row and column to 0's.
 * You must do it in place.
 * 
 */


class Solution {
    public void setZeroes(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < m ; j++){
                if(matrix[i][j] == 0){
                    markRow(i,m, matrix);
                    markCol(j,n, matrix);
                }
            }
        }

        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < m ; j++){
                if(matrix[i][j] == -1000 ){
                    matrix[i][j] = 0;
                }
            }
        }

    }

    public void markRow(int i ,int m, int[][] matrix){
        for(int j = 0 ; j < m; j++){
            if(matrix[i][j] != 0){
                matrix[i][j] = -1000;
            }
        }
    }

    public void markCol(int j ,int n ,int[][] matrix){
        for(int i = 0 ; i < n ; i++){
            if(matrix[i][j] != 0){
                matrix[i][j] = -1000;
            }        
        }
    }

}