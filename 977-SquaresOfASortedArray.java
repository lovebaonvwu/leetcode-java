class Solution {
    public int[] sortedSquares(int[] A) {
        int[] ans = new int[A.length];

        int i = 0;
        int j = A.length - 1;
        int k = ans.length - 1;

        while (i <= j) {
            int head = A[i] * A[i];
            int tail = A[j] * A[j];

            if (head >= tail) {
                ans[k--] = head;
                ++i;
            } else {
                ans[k--] = tail;
                --j;
            }
        }

        return ans;
    }
}