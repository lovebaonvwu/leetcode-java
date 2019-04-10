class Solution {
    public int reverse(int x) {
        long ans = 0;

        boolean neg = x < 0 ? true : false;

        int min = 1 << 31;
        int max = (1 << 31) - 1;

        x = neg ? -x : x;

        while (x > 0) {
            int remainder = x % 10;
            ans = ans * 10 + remainder;

            x /= 10;
        }

        ans = neg ? -ans : ans;

        if (ans > max || ans < min) {
            return 0;
        }

        return (int) ans;
    }
}