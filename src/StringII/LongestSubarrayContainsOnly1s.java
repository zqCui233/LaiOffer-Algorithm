package StringII;

public class LongestSubarrayContainsOnly1s {
    public int longestConsecutiveOnes(int[] nums, int k) {
        int i = 0, j = 0, count = 0, longest = 0;

        while (j < nums.length) {
            if (nums[j] == 1) {
                longest = Math.max(longest, ++j - i);
            } else if (count < k) {
                count++;
                longest = Math.max(longest, ++j - i);
            } else if(nums[i++] == 0) {
                count--;
            }
        }

        return longest;
    }
}
