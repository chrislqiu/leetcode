class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> out = new ArrayList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            List<Integer> subArr = new ArrayList<>();
            int qLen = q.size();
            for (int i = 0; i < qLen; i++) {
                TreeNode n = q.poll();
                if (n != null) {
                    subArr.add(n.val);
                    q.offer(n.left);
                    q.offer(n.right);
                }
            }
            if (!subArr.isEmpty()) {
                out.add(subArr);
            }
        }
        return out;
    }
}
