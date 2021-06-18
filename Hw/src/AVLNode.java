public class AVLNode {
    private AVLNode left, right;
    private String key;
    private int height;


    public AVLNode(String key) {
        this.key = key;
        this.left = this.right = null;
    }

    public AVLNode getLeft() {
        return left;
    }

    public AVLNode getRight() {
        return right;
    }

    public void setLeft(AVLNode nLeft) {
        this.left = nLeft;
    }

    public void setRight(AVLNode nRight) {
        this.right = nRight;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getHeight(){return height;}

    public void setHeight(int height){this.height = height;}
}