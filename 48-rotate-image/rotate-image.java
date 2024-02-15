class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix[0].length;
        int col = matrix.length;
        for (int i = 0; i < col; i++) {
            for (int j = i + 1; j < row; j++) {
                if (i != j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        int k = row - 1;
        for(int r=0; r<matrix.length; r++) {
            int left = 0;
            int right = matrix.length-1;

            while(left < right) {
                int temp = matrix[r][left];
                matrix[r][left] = matrix[r][right];
                matrix[r][right] = temp;

                left++;
                right--;
            }
        }
    }
}