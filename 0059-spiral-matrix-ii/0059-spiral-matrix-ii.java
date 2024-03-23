class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n]; 
        int count = 0;
        int r1 = 0;
        int c1 = 0;
        int r2 = n-1;
        int c2 = n-1;
        while(count<n*n){
            for(int c = c1; c <= c2 && count<n*n; c++){
                matrix[r1][c] = count + 1;
                count ++;
            }
            for(int r = r1+1; r <= r2 && count<n*n; r++){
                matrix[r][c2] = count + 1;
                count++;
            }
            for(int c = c2-1; c >= c1 && count<n*n; c--){
                matrix[r2][c] = count + 1;
                count++;
            }
            for(int r= r2-1; r > r1 && count<n*n; r--){
                matrix[r][c1] = count + 1;
                count++;
            }
            r1++;
            c1++;
            r2--;
            c2--;
        }
        return matrix;
    }
}