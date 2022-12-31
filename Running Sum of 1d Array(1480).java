class Solution {
    public int[] runningSum(int[] nums) {
        int[] out = new int[nums.length];
        out[0] = nums[0];
        for (int i = 1; i < out.length; i++) {
            out[i] = nums[i] + out[i - 1];
        }
        return out;
    }
}
