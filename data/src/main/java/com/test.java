package com;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: mydemo
 * @description: leetcode
 * @author: cm
 * @create: 2020-01-11 20:30
 **/
public class test {
    public List<Integer> postorderTraversal(TreeNode root) {
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        List<Integer> rst = new ArrayList<>();
        rst.add(root.val);
        return rst;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
