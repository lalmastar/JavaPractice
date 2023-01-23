package ACollege.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
    }
}
public class BinaryTree {
    static int idx=-1;
    public static Node buildTree(int[] nodes){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }
        Node newNode=new Node(nodes[idx]);
        newNode.left=buildTree(nodes);
        newNode.right=buildTree(nodes);

        return newNode;
    }
    public static void preOrder(Node root) {
        if(root != null) {
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void inOrder(Node root) {
        if(root != null) {
            preOrder(root.left);
            System.out.print(root.data+" ");
            preOrder(root.right);
        }
    }
    public static void postOrder(Node root) {
        if(root != null) {
            preOrder(root.left);
            preOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void levelOrder(Node root) {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()) {
            Node currNode=q.remove();
            if(currNode==null) {
                System.out.println();
                if(q.isEmpty()) {
                    break;
                }else {
                    q.add(null);
                }
            }
            else {
                System.out.print(currNode.data+" ");
                if(currNode.left != null) {
                    q.add(currNode.left);
                }
                if(currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }
    public static int countNodes(Node root) {
        if(root == null) {
            return 0;
        }

        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);

        return leftNodes+rightNodes+1;
    }
    public static int sumNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int leftSum = sumNodes(root.left);
        int rightSum = sumNodes(root.right);

        return leftSum+rightSum+root.data;
    }
    public static int heightTree(Node root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = heightTree(root.left);
        int rightHeight = heightTree(root.right);

        int height = Math.max(leftHeight, rightHeight)+1;

        return height;
    }

    public static int diameterTree1(Node root) {
        // TC o(n square)
        if(root == null) {
            return 0;
        }

        int diameter1 = diameterTree1(root.left);
        int diameter2 = diameterTree1(root.right);
        int diameter3 = heightTree(root.left) + heightTree(root.right) + 1;

        return Math.max(diameter3, Math.max(diameter2, diameter3));
    }

    static class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht, int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }
    public static TreeInfo diameterTree2(Node root) {
        // TC o(n)

        if(root == null) {
            return new TreeInfo(0,0);
        }

        TreeInfo left = diameterTree2(root.left);
        TreeInfo right = diameterTree2(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int mydiam = Math.max(diam3, Math.max(diam1, diam2));

        TreeInfo myInfo = new TreeInfo(myHeight, mydiam);

        return myInfo;
    }
    public static void printLeftView(Node root)
    {
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            // number of nodes at current level
            int n = queue.size();

            // Traverse all nodes of current level
            for (int i = 1; i <= n; i++) {
                Node temp = queue.poll();

                // Print the left most element at
                // the level
                if (i == 1)
                    System.out.print(temp.data + " ");

                // Add left node to queue
                if (temp.left != null)
                    queue.add(temp.left);

                // Add right node to queue
                if (temp.right != null)
                    queue.add(temp.right);
            }
        }
    }

    public static void rightView(Node root)
    {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {

            // get number of nodes for each level
            int n = q.size();

            // traverse all the nodes of the current level
            for (int i = 0; i < n; i++) {
                Node curr = q.peek();
                q.remove();

                // print the last node of each level
                if (i == n - 1) {
                    System.out.print(curr.data+" ");
//                    System.out.print(" ");
                }

                // if left child is not null add it into
                // the
                // queue
                if (curr.left != null) {
                    q.add(curr.left);
                }

                // if right child is not null add it into
                // the
                // queue
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nodes= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
//      tree.preOrder(root);
//		System.out.println();
//		tree.inOrder(root);
//		System.out.println();
//		tree.postOrder(root);
//		System.out.println();
        tree.levelOrder(root);
//      tree.printLeftView(root);
//      System.out.println();
//      tree.rightView(root);
//		System.out.println(countNodes(root));
//		System.out.println(sumNodes(root));
//		System.out.println(heightTree(root));
//		System.out.println(diameterTree1(root));
//		System.out.println(diameterTree2(root).diam);
    }
}
