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

    public String Min(BSTitem root)  {
        String minimum = root.key;
        while (root.left != null)  {
            minimum = root.left.key;
            root = root.left;
        }
        return minimum;
    }

    public String Max(BSTitem root)  {
        String maximum = root.key;
        while (root.right != null)  {
            maximum = root.right.key;
            root = root.right;
        }
        return maximum;
    }
    public String getSucc (BSTitem root) {
        if (root.right != null)
            return Min (root.right);
        String succ = root.p.key;
        while (succ != null && root.key == root.p.right.key) {
            root.key = succ;
            succ = root.p.key;
        }
        return succ;
    }
    public String getPred (BSTitem root) {
        if (root.left != null)
            return Max (root.left);
        String pred = root.p.key;
        while (pred != null && root.key == root.p.left.key) {
            root.key = pred;
            pred = root.p.key;
        }
        return pred;
    }
    public static BSTitem insert(BSTitem root, String x){
        if (root == null)
            return new BSTitem(x);
        else if(root.key.compareTo(x) == -1)
            root.right.key = x;
        else
            root.left.key = x;
        return root;
    }
}