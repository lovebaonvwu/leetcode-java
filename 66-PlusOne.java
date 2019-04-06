class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;

        for (int i = digits.length - 1; i >= 0; --i) {
            int sum = carry + digits[i];

            digits[i] = sum % 10;

            if (sum < 10) {
                carry = 0;
                break;
            }
        }

        int[] ans;
        if (carry > 0) {
            ans = new int[digits.length + 1];
            ans[0] = 1;

            for (int i = 0; i < digits.length; ++i) {
                ans[i + 1] = digits[i];
            }
        } else {
            ans = digits;
        }

        return ans;
    }
}