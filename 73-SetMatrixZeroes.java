class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean topRowContain0 = false;
        boolean leftColContain0 = false;

        for (int col = 0; col < n; ++col) {
            if (matrix[0][col] == 0) {
                topRowContain0 = true;
            }
        }

        for (int row = 0; row < m; ++row) {
            if (matrix[row][0] == 0) {
                leftColContain0 = true;
            }
        }

        for (int row = 1; row < m; ++row) {
            for (int col = 1; col < n; ++col) {
                if (matrix[row][col] == 0) {
                    matrix[0][col] = 0;
                    matrix[row][0] = 0;
                }
            }
        }

        for (int row = 1; row < m; ++row) {
            for (int col = 1; col < n; ++col) {
                if (matrix[row][0] == 0 || matrix[0][col] == 0) {
                    matrix[row][col] = 0;
                }
            }
        }

        if (topRowContain0) {
            for (int col = 0; col < n; ++col) {
                matrix[0][col] = 0;
            }
        }

        if (leftColContain0) {
            for (int row = 0; row < m; ++row) {
                matrix[row][0] = 0;
            }
        }
    }
}

// class Solution {
//     public void setZeroes(int[][] matrix) {
//         boolean firstLineContainZero = false;

//         for (int i = 0; i < matrix[0].length; ++i) {
//             if (matrix[0][i] == 0) {
//                 firstLineContainZero = true;
//                 break;
//             }
//         }

//         for (int i = 1; i < matrix.length; ++i) {
//             boolean lineContainZero = false;

//             for (int j = 0; j < matrix[i].length; ++j) {
//                 if (matrix[i][j] == 0) {
//                     matrix[0][j] = 0;
//                     lineContainZero = true;
//                 }
//             }

//             if (lineContainZero) {
//                 for (int j = 0; j < matrix[i].length; ++j) {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }

//         for (int j = 0; j < matrix[0].length; ++j) {
//             if (matrix[0][j] == 0) {
//                 for (int i = 0; i < matrix.length; ++i) {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }

//         if (firstLineContainZero) {
//             for (int j = 0; j < matrix[0].length; ++j) {
//                 matrix[0][j] = 0;
//             }
//         }
//     }
// }