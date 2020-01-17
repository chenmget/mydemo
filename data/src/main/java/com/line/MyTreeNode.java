package com.line;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/**
 * @program: mydemo
 * @description: 树
 * @author: cm
 * @create: 2020-01-11 15:52
 **/
public class MyTreeNode {
    private static class TreeNode {
        Integer data;
        TreeNode leftNode;
        TreeNode rightNode;

        public TreeNode(Integer data) {
            this.data = data;
        }
    }


    public static TreeNode crateBinaryTree(LinkedList<Integer> list) {
        TreeNode node = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Integer data = list.removeFirst();
        if (data != null) {
            node = new TreeNode(data);
            node.leftNode = crateBinaryTree(list);
            node.rightNode = crateBinaryTree(list);
        }
        return node;
    }

    public static void main(String[] args) {
        LinkedList<Integer> inputList = new LinkedList<Integer>(Arrays.asList(new Integer[]{3, 2, 9, null, null, 10, null, null, 8, null, 4}));
        TreeNode treeNode = crateBinaryTree(inputList);
//        System.out.println("前序遍历");
//        preOrderTraveral(treeNode);
//        System.out.println("中序遍历");
//        inOrderTraveral(treeNode);
        System.out.println("后序遍历");
        postOrderTraveral(treeNode);
        System.out.println("后序遍历");
        postOrderTraveral1(treeNode);


    }

    private static void preOrderTraveral(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        System.out.println(treeNode.data);
        preOrderTraveral(treeNode.leftNode);
        preOrderTraveral(treeNode.rightNode);
    }

    private static void inOrderTraveral(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        inOrderTraveral(treeNode.leftNode);
        System.out.println(treeNode.data);
        inOrderTraveral(treeNode.rightNode);
    }

    private static void postOrderTraveral(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        postOrderTraveral(treeNode.leftNode);
        postOrderTraveral(treeNode.rightNode);
        System.out.println(treeNode.data);
    }

    private static void postOrderTraveral1(TreeNode treeNode) {
        TreeNode cur = treeNode;
        Stack<TreeNode> stack = new Stack();
        List<Integer> list = new ArrayList<>();
        TreeNode last = null;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.leftNode;
            } else {
                TreeNode temp = stack.peek();
                if(temp.rightNode!=null&& temp.rightNode != last){
                    cur=temp.rightNode;
                }else{
                    list.add(temp.data);
                    last = temp;
                    stack.pop();
                }
            }
        }
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
