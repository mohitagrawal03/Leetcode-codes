class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        //List<List<Integer>> idx = new ArrayList<>();
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();
        
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if(matrix[r][c] == 0) {
                    // List<Integer> temp = new ArrayList<>();
                    // temp.add(r);
                    // temp.add(c);
                    // idx.add(temp);
                    row.add(r);
                    col.add(c);
                }
            }
        }
        
        // for (int r = 0; r < m; r++) {
        //     for (int c = 0; c < n; c++) {
        //         if(row.contains(r) || col.contains(c)) {
        //             matrix[r][c] = 0;
        //         }
        //     }
        // }
        
        for (int r : row) {
            for (int c = 0; c < n; c++) {
                matrix[r][c] = 0;
            }
        }
        
        for (int r = 0; r < m; r++) {
            for (int c : col) {
                matrix[r][c] = 0;
            }
        }
    }
}