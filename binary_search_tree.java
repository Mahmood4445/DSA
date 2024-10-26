public class binary_search_tree {
    node root;
    class node {
        int key;
        node right, left;

        node(int val) {
            key = val;
            right = null;
            left = null;
        }
    }
    binary_search_tree(int val){
        root = new node(val);
    }
    public void insert(int key){
        insert(root,key);
    }
    public node insert(node root,int key){
        if (root == null )
            return new node(key);
        if(root.key<key)
            root.right= insert(root.right,key);
        else
            root.left= insert(root.left,key);
        return root;
    }
    public void inorder(node root){
        if(root != null){

            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
    public node search(node root,int key){
        if (root == null || root.key == key)
            return root;
        if (root.key < key )
            return search(root.right,key);
        return search(root.left,key);

    }
    public node delete( node root , int val){
        if (root ==  null)
            return root;
        if (val> root.key)
            root.right = delete(root.right,val);
        else if (val< root.key)
            root.left = delete(root.left,val);
        else {
            if (root.right == null )
                return root.left;
            else if (root.left == null)
                return root.right;
            root.key = min(root.right);
            root.right=delete(root.right,root.key);

        }

         return root;
    }
    public int min(node root){
        int minval = root.key;
        while (root.left!=null){
            minval = root.left.key;
            root=root.left;
        }
        return minval;
    }

}
