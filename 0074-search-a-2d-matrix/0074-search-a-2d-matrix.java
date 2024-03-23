class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int h = matrix.length * matrix[0].length - 1; 
        while(l <= h) {
            int mid = (l+h)/2;
            int midVal = matrix[mid / matrix[0].length][mid % matrix[0].length]; 
            if(midVal == target){
                return true;
            }
            else if(midVal < target){
                l = mid + 1;
            }
            else{
                h = mid - 1;
            }
        }
        return false;
    }
}