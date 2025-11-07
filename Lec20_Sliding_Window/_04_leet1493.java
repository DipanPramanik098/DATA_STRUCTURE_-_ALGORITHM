// https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/description/?envType=study-plan-v2&envId=leetcode-75

public class _04_leet1493{
    public int longestSubarray(int[] nums) {
        int st = 0;
        int end = 0;
        int maxi = 0;
        int delc = 0;
        while (end < nums.length) {
            if (nums[end] == 0)
                delc++;
            while (delc > 1 && st < end) {
                if (nums[st] == 0)
                    delc--;
                st++;
            }
            maxi = Math.max(maxi, end - st);
            end++;
        }
        return maxi;
    }

    public static void main(String[] args) {
        _04_leet1493 obj = new _04_leet1493();
        int[] nums = {1,1,0,1};
        System.out.println(obj.longestSubarray(nums)); // 3
    }
}