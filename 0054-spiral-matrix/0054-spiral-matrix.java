class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int count = 0;

        int r1 = 0;
        int c1 = 0;
        int r2 = matrix.length-1;
        int c2 = matrix[0].length-1;
        while(count<matrix.length*matrix[0].length){
            for(int c = c1; c <= c2 && count<matrix.length*matrix[0].length; c++){
                result.add(matrix[r1][c]);
                count ++;
            }
            for(int r = r1+1; r <= r2 && count<matrix.length*matrix[0].length; r++){
                result.add(matrix[r][c2]);
                count++;
            }
            for(int c = c2-1; c >= c1 && count<matrix.length*matrix[0].length; c--){
                result.add(matrix[r2][c]);
                count++;
            }
            for(int r= r2-1; r > r1 && count<matrix.length*matrix[0].length; r--){
                result.add(matrix[r][c1]);
                count++;
            }
            r1++;
            c1++;
            r2--;
            c2--;
        }  
        return result;
    }     
}