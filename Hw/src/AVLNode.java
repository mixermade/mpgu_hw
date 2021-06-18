public class AVLNode {
    private AVLNode left, right;
    private String key;
    private int height;


    public AVLNode(String key) {
        this.key = key;
        this.left = this.right = null;
    }
