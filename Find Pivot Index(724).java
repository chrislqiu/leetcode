class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int pivot;
        for (pivot = 0; pivot < nums.length; pivot++) {
            leftSum = 0;
            rightSum = 0;
            for (int i = 0; i < pivot; i++) {
                leftSum += nums[i];
            }
            for (int j = pivot + 1; j < nums.length; j++) {
                rightSum += nums[j];
            }
            if (leftSum == rightSum) {
                return pivot;
            }
        }
        return -1;
    }
}
