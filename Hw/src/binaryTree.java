public class binaryTree {
    private BSTitem root;

    public binaryTree(){
        root = null;
    }
    public BSTitem search (String key){
     return SearchRec (key, root);
    }

    private static BSTitem SearchRec (String key, BSTitem root){
    if (root == null)
        return null;
    if (root.key.equals(key))
        return root;
    if (root.key.compareTo(key) == -1)
        return SearchRec (key, root.right);
    return SearchRec (key, root.left);
    }
