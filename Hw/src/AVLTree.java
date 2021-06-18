public class AVLTree {
    private AVLNode root;

    public AVLTree() {
        root = null;
    }

    public String getMin() {
        if (root == null)
            throw new RuntimeException("empty tree");
        return getMinRec(root).getKey();
    }

    public String getMax() {
        if (root == null)
            throw new RuntimeException("empty tree");
        return getMaxRec(root).getKey();
    }

    private static AVLNode getMaxRec(AVLNode root) {
        if (root.getRight() != null)
            return getMaxRec(root.getRight());
        return root;
    }

    private static AVLNode getMinRec(AVLNode root) {
        if (root.getLeft() != null)
            return getMinRec(root.getLeft());
        return root;
    }
