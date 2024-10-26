public class binary_tree {
    node root;
    class node{
        int data;
        node right,left;
        node(int val){
            data = val;
            right =null;
            left =null;
        }

    }
    binary_tree(int val){
        root = new node( val);
    }
    public void insert_left(node r,int val){
        node newnode = new node(val);
        r.left = newnode;
    }
    public void insert_right(node r,int val){
        node newnode = new node(val);
        r.right = newnode;
    }
    public static void preorder(node root){
        if(root != null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void inorder(node root){
        if(root != null){

            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    public static void postorder(node root){
        if(root != null){

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
}
