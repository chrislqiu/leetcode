class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> out = new ArrayList<>();
        if (root == null) {
            return out;
        }
        preorder(root, out);
        return out;
    }

    private void preorder (Node root, List<Integer> out) {
        if (root != null) {
            out.add(root.val);
            for (Node n : root.children) {
                preorder(n, out);
            }
        }
    }
}
