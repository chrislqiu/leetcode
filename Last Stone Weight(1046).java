class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for (int stone : stones) {
            //min Heap by default, invert sign
            maxHeap.add(-stone);
        }

        while (maxHeap.size() > 1) {
            int stone1 = -maxHeap.remove();
            int stone2 = -maxHeap.remove();
            if (stone1 != stone2) {
                maxHeap.add(-(stone1 - stone2));
            }
        }
        //If heap is empty, return 0, else max 
        return maxHeap.isEmpty() ? 0 : -maxHeap.remove();
    }
}
