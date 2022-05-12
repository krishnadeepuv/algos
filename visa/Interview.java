package visa;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Interview {

    class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(TreeNode l, TreeNode r, int v) {
            this.left = l;
            this.right = r;
            this.val = v;
        }
    }

    public static TreeNode shiftChild(TreeNode root) {

        if (root == null)
            return root;

        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while (qu.size() > 0) {
            TreeNode curr = qu.poll();

            TreeNode temp = curr.left;
            curr.left = curr.right;
            curr.right = temp;

            qu.add(curr.left);
            qu.add(curr.right);
        }

        return root;

    }

    public static void inorder(TreeNode root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }

    public static void main(String[] args) {
        TreeNode t5 = new TreeNode(null, null, 5);
        TreeNode t4 = new TreeNode(null, null, 4);
        TreeNode t3 = new TreeNode(null, null, 3);
        TreeNode t2 = new TreeNode(t4, t5, 2);
        TreeNode t1 = new TreeNode(t2, t3, 1);

        TreeNode root = shiftChild(t1);
        inorder(root);

    }
}

// Q: Implement a method that takes in a Node, which represents the head of a
// binary tree. The return of this method is also a node, that points to the
// //binary tree that is the "mirrored" version of that tree ie.

/*
 * Input Output
 * 1 |  1
 * /\ | /\
 * 2 3 | 3 2
 * /\ |    /\
 * 4 5 |   5 4
 */

// 3,1,5,4,2
