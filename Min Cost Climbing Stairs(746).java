class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int front = 0;
        int back = 0;
        for(int i = cost.length - 1; i >= 0; i--) {
            //From the end, calculate the min between 1 or 2 steps and adds the cost
            int curr = cost[i] + Math.min(front, back);
            //Setting front "step" to the back 
            front = back;
            //Setting back to the min cost to get to current
            back = curr;
        }
        //returns the min cost between index(step) 1 and 0
        return Math.min(front, back);
    }
}
