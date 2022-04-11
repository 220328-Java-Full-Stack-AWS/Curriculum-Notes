import javax.swing.tree.TreeNode;

public class Driver {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree(); //creates new tree
        tree.root = new Node(1); //adds root
        //Add branches to tree
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        PrintTree printTree = new PrintTree();
        printTree.printInorder(tree.root);

        tree.addRecursive(tree.root, 6);
        System.out.println("");
        printTree.printInorder(tree.root);
        /*
        tree.deleteRecursive(tree.root, 6);
        System.out.println("");
        printTree.printInorder(tree.root);

         */
    }

}
