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

    public AVLNode search(String key) {
        if (root == null)
            return null;
        return searchRec(root, key);
    }

    private static AVLNode searchRec(AVLNode root, String key) {
        if (root == null)
            return null;
        if (root.getKey().equals(key))
            return root;
        if (root.getKey().compareTo(key) < 0)
            return searchRec(root.getRight(), key);
        return searchRec(root.getLeft(), key);
    }

    public int height(){
        if(root == null){return -1;}
        else{return root.getHeight();}
    }
    private int height(AVLNode node){
        if(node == null){return -1;}
        else{return node.getHeight();}
    }

    private void updateHeight(AVLNode node){
        node.setHeight(1 + Math.max(height(node.getLeft()), height(node.getRight())));
    }

    public int getBalance(AVLNode node) {
        if (node == null) {
            return 0;
        }
        else {
            return height(node.getRight()) - height(node.getLeft());
        }
    }

    private AVLNode rebalance(AVLNode node) {
        updateHeight(node);
        int balance = getBalance(node);
        if (balance > 1) {
            if (height(node.getRight().getRight()) > height(node.getRight().getLeft())) {
                node = rotateLeft(node);
            } else {
                node.setRight(rotateRight(node.getRight()));
                node = rotateLeft(node);
            }
        } else if (balance < -1) {
            if (height(node.getLeft().getLeft()) > height(node.getLeft().getRight())) {
                node = rotateRight(node);
            } else {
                node.setLeft(rotateLeft(node.getLeft()));
                node = rotateRight(node);
            }
        }
        return node;
    }

    public void insert(String key) {
        root = insertRec(root, key);
    }

    private AVLNode insertRec(AVLNode node, String key) {
        if(node == null){return new AVLNode(key);}
        else if (node.getKey().compareTo(key) > 0) {
            node.setLeft(insertRec(node.getLeft(), key));
        } else if (node.getKey().compareTo(key) < 0) {
            node.setRight(insertRec(node.getRight(), key));
        } else {
            throw new RuntimeException("Duplicate Key!");
        }
        return rebalance(node);
    }

    private AVLNode rotateRight(AVLNode node) {
        AVLNode nNode = node.getLeft();
        AVLNode anotherNode = nNode.getRight();
        nNode.setRight(node);
        node.setLeft(anotherNode);
        updateHeight(node);
        updateHeight(nNode);
        return nNode;
    }

    private AVLNode rotateLeft(AVLNode node) {
        AVLNode nNode = node.getRight();
        AVLNode anotherNode = nNode.getLeft();
        nNode.setLeft(node);
        node.setRight(anotherNode);
        updateHeight(node);
        updateHeight(nNode);
        return nNode;
    }

    public void delete(String key) {
        root = deleteRec(root, key);
    }
