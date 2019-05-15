class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums.length == 0 || nums[0].length * nums.length != r * c) 
            return nums;
        
        int[][] ans = new int[r][c];
        int col = nums[0].length;
        
        for (int i = 0; i < r; ++i) {
            for (int j = 0; j < c; ++j) {
                int index = i * c + j;
                
                ans[i][j] = nums[index / col][index % col];
            }
        }
        
        return ans;
    }
}