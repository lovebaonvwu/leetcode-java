class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<Integer>();

        if (matrix.length == 0)
            return ans;

        int rowLo = 0;
        int rowHi = matrix.length;
        int colLo = 0;
        int colHi = matrix[0].length;

        while (rowLo < rowHi || colLo < colHi) {

            // left => right
            for (int j = colLo; j < colHi; ++j) {
                ans.add(matrix[rowLo][j]);
            }

            // delete top row
            ++rowLo;
            if (rowLo == rowHi)
                break;

            // top => bottom
            for (int i = rowLo; i < rowHi; ++i) {
                ans.add(matrix[i][colHi - 1]);
            }

            // delete right col
            --colHi;
            if (colLo == colHi)
                break;

            // right => left
            for (int j = colHi - 1; j >= colLo; --j) {
                ans.add(matrix[rowHi - 1][j]);
            }

            // delete bottom row
            --rowHi;
            if (rowLo == rowHi)
                break;

            // bottom => top
            for (int i = rowHi - 1; i >= rowLo; --i) {
                ans.add(matrix[i][colLo]);
            }

            // delete left col
            ++colLo;
            if (colLo == colHi)
                break;
        }

        return ans;
    }
}