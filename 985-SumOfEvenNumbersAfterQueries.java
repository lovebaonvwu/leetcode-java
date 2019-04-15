
// O(n)
class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] ans = new int[queries.length];

        int sum = 0;
        for (int i : A) {
            sum += i % 2 == 0 ? i : 0;
        }

        for (int i = 0; i < queries.length; ++i) {
            int[] query = queries[i];

            int ori = A[query[1]];
            sum -= ori % 2 == 0 ? ori : 0;

            int temp = ori + query[0];
            A[query[1]] = temp;

            sum += temp % 2 == 0 ? temp : 0;

            ans[i] = sum;
        }

        return ans;
    }
}

// O(n**2) Time Limit Exceeded
// class Solution {
//     public int[] sumEvenAfterQueries(int[] A, int[][] queries) {

//         int[] ans = new int[A.length];

//         for (int i = 0; i < A.length; ++i) {
//             int[] query = queries[i];

//             A[query[1]] += query[0];

//             int sum = 0;
//             for (int j = 0; j < A.length; ++j) {
//                 int temp = A[j] < 0 ? -A[j] : A[j];

//                 if (temp % 2 == 0) {
//                     sum += A[j];
//                 }
//             }

//             ans[i] = sum;
//         }

//         return ans;
//     }
// }