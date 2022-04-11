public class PrintTree {

    BinaryTree binaryTree = new BinaryTree();

    void printPostorder(Node node) //(Left, Right, Root) 2, 3, 1
    {
        if (node == null)
            return;

        // first recur on left subtree
        printPostorder(node.left);

        // then recur on right subtree
        printPostorder(node.right);

        // now deal with the node
        System.out.print(node.key + " ");
    }

    /* Given a binary tree, print its nodes in inorder*/
    //(Left, Root, Right)  2, 1, 3
    void printInorder(Node node)
    {
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.left);

        /* then print the data of node */
        System.out.println("");
        System.out.print(node.key + " ");

        /* now recur on right child */
        printInorder(node.right);
    }



    /* Given a binary tree, print its nodes in preorder*/
    void printPreorder(Node node) //(Root, Left, Right) 1, 2, 3
    {
        if (node == null)
            return;

        /* first print data of node */
        System.out.print(node.key + " ");

        /* then recur on left subtree */
        printPreorder(node.left);

        /* now recur on right subtree */
        printPreorder(node.right);
    }




}
