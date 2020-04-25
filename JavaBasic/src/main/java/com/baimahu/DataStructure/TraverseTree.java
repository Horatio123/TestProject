package com.baimahu.DataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TraverseTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        BinaryTree binaryTree = new BinaryTree(root);
        System.out.print("Inorder traverse: \n");
        binaryTree.RecursiveInorder(root);
        System.out.print("\nPreorder traverse: \n");
        binaryTree.RecursivePreorder(root);
        System.out.print("\nPostorder traverse: \n");
        binaryTree.RecursivePostorder(root);

        ArrayList<Integer> inorderList = binaryTree.StackInorder(root);
        ArrayList<Integer> preorderList = binaryTree.StackPreorder(root);
        ArrayList<Integer> levelorderList = binaryTree.LevelOrder(root);
        //inorderList.forEach(System.out::print);
        System.out.print("\nInorder traverse: \n");
        inorderList.forEach(val -> System.out.print(val + " "));
        System.out.print("\nPreorder traverse: \n");
        preorderList.forEach(System.out::print);
        System.out.print("\nLevel traverse: \n");
        levelorderList.forEach(val -> System.out.print(val + " "));

    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

}

class BinaryTree {
    TreeNode root;
    BinaryTree(TreeNode node) {
        root = node;
    }

    public void RecursiveInorder(TreeNode node) {
        if (node == null) return;

        RecursiveInorder(node.left);
        System.out.print(node.val + " ");
        RecursiveInorder(node.right);
    }

    public void RecursivePreorder(TreeNode node) {
        if (node == null) return;

        System.out.print(node.val + " ");
        RecursivePreorder(node.left);
        RecursivePreorder(node.right);
    }

    public void RecursivePostorder(TreeNode node) {
        if (node == null) return;

        RecursivePostorder(node.left);
        RecursivePostorder(node.right);
        System.out.print(node.val + " ");
    }

    public ArrayList<Integer> StackInorder(TreeNode node) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                list.add(node.val);
                node = node.right;
            }
        }
        return list;
    }

    public ArrayList<Integer> StackPreorder(TreeNode node) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                list.add(node.val);
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                node = node.right;
            }
        }
        return list;
    }

    public ArrayList<Integer> LevelOrder(TreeNode node) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            node = queue.remove();
            list.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }

        return list;
    }

}