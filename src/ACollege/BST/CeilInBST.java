package ACollege.BST;

import java.util.Scanner;

public class CeilInBST {
    static class Node{
        int data;
        BinarySearchTree.Node left;
        BinarySearchTree.Node right;

        Node(int data) {
            this.data=data;
        }
    }

    public static BinarySearchTree.Node insert(BinarySearchTree.Node root, int val) {
        if(root == null) {
            root = new BinarySearchTree.Node(val);
            return root;
        }

        if(root.data > val) {
            root.left = insert(root.left, val);
        }
        else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static int Ceil(BinarySearchTree.Node root, int input)
    {

        // Base case
        if (root == null) {
            return -1;
        }

        // We found equal key
        if (root.data == input) {
            return root.data;
        }

        // If root's key is smaller,
        // ceil must be in right subtree
        if (root.data < input) {
            return Ceil(root.right, input);
        }

        // Else, either left subtree or root
        // has the ceil value
        int ceil = Ceil(root.left, input);

        return (ceil >= input) ? ceil : root.data;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        BinarySearchTree.Node root=null;
        int n=input.nextInt();
        int[] values=new int[n];
        for (int i = 0; i < n; i++) {
            values[i]=input.nextInt();
        }
        int x= input.nextInt();

        for(int i=0; i<values.length; i++) {
            root = insert(root, values[i]);
        }
        int i=1;
        for (i = i; i <= x; i++) {

            Ceil(root, i);
        }
        System.out.println(Ceil(root,x));
    }
}
