class Solution {
    public void rotate(int[][] matrix) {
        int temp;
        for(int r = 0; r < matrix.length; r++){
            for(int c = r; c < matrix[0].length; c++){
                    temp = matrix[r][c];
                    matrix[r][c] = matrix[c][r];
                    matrix[c][r] = temp;
            }
        }
        for(int r = 0; r < matrix.length; r++){
            for(int c = 0; c < matrix[0].length/2; c++){
                temp = matrix[r][c];
                matrix[r][c] = matrix[r][matrix[0].length-1-c];
                matrix[r][matrix[0].length-1-c] = temp;
            }
        }
    }
}