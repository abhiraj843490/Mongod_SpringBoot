package com.example.demo;


class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class TreeTraversal {
    Node root;

    TreeTraversal() {
        root = null;
    }
    void printInorder(Node node) {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.key + " -");
        printInorder(node.right);
    }

    // Driver code
    public static void main(String[] args) {
        TreeTraversal tree = new TreeTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Function call
        tree.printInorder(tree.root);
    }
}

