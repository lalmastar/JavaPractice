package ACollege.BST;

import java.util.*;

public class BinarySearchTree {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data=data;
        }
    }

    public static Node insert(Node root, int val) {
        if(root == null) {
            root = new Node(val);
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

    public static void inOrder(Node root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static boolean search(Node root, int key) {
        if(root == null) {
            return false;
        }

        if(root.data > key) {
            return search(root.left, key);
        }
        else if(root.data == key) {
            return true;
        }
        else {
            return search(root.right, key);
        }

    }

    public static Node delete(Node root, int val) {
        if(root.data > val) {
            root.left = delete(root.left, val);
        }
        else if(root.data < val) {
            root.right = delete(root.right, val);
        }
        else {
            if(root.left == null && root.right == null) {
                return null;
            }

            if(root.left == null) {
                return root.right;
            }
            else if(root.right == null) {
                return root.left;
            }

            Node IS = inOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }
        return root;
    }

    public static Node inOrderSuccessor(Node root) {
        while(root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static void printInRange(Node root, int x, int y) {
        if(root == null) {
            return;
        }

        if(root.data >= x && root.data <= y) {
            printInRange(root.left, x, y);
            System.out.print(root.data+" ");
            printInRange(root.right, x, y);
        }
        else if(root.data >= y) {
            printInRange(root.left, x, y);
        }
        else {
            printInRange(root.right, x, y);
        }
    }

    public static int Ceil(Node root, int input)
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
        // TODO Auto-generated method stub
//        int[] values = {5,1,3,4,2,7,9,8,6,10};
        int[] values = {4, 5, 8, 9, 13};
        Node root=null;

        for(int i=0; i<values.length; i++) {
            root = insert(root, values[i]);
        }

        inOrder(root);
//        System.out.println();
//		System.out.println(search(root,10));
//		delete(root,9);
//		inOrder(root);
//        printInRange(root,5,10);
        int i=1;
        for (i = i; i <= 7; i++) {

            Ceil(root, i);
        }
//        System.out.println(Ceil(root,7));
    }

}

