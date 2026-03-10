//3719 Longest Balanced subarray
//Medium problem 
//solved using hashsets 

class Solution {
    public int longestBalanced(int[] nums) {
        int maxLen = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (n - i <= maxLen) break; 
            HashSet<Integer> evens = new HashSet<>();
            HashSet<Integer> odds = new HashSet<>();

            for (int j = i; j < n; j++) {
                if (nums[j] % 2 == 0) {
                    evens.add(nums[j]);
                } else {
                    odds.add(nums[j]);
                }
                if (evens.size() == odds.size()) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }
}
