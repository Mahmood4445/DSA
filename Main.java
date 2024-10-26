import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        binary_search_tree tree = new binary_search_tree(30);
        tree.insert(10);
        tree.insert(20);
        tree.insert(40);
        tree.insert(50);
        tree.inorder(tree.root);
       tree.delete(tree.root, 50);
        tree.inorder(tree.root);

    }
    }
