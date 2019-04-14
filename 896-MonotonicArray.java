class Solution {
    public boolean isMonotonic(int[] A) {

        if (A.length < 2)
            return true;

        int flag = 2;

        for (int i = 1; i < A.length; ++i) {
            if (A[i] > A[i - 1]) {
                if (flag == 1) {
                    return false;
                }

                flag = 0;
            } else if (A[i] < A[i - 1]) {
                if (flag == 0) {
                    return false;
                }

                flag = 1;
            }
        }

        return true;
    }
}