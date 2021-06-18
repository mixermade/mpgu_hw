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
