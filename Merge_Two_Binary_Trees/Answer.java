package mtbt;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 */

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        if(t1 == null) {
            return t2;
        }
        if(t2 == null) {
            return t1;
        }

        t1.val = t1.val + t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
}

public class Answer {
    public static void main(String[] args) {

        int[] arr1 = { 1, 3, 2, 5 };
        int[] arr2 = { 2, 1, 3, 8, 4, 6, 7 };

        TreeNode t1 = createTree(arr1);
        TreeNode t2 = createTree(arr2);

        Solution sol = new Solution();
        TreeNode ret = sol.mergeTrees(t1, t2);

        System.out.println(ret);
    }

    static TreeNode createTree(int[] arr) {

        List<TreeNode> tree = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            TreeNode node = new TreeNode(arr[i]);
            tree.add(node);
        }

        // 获取树的层级(不包括叶子节点)
        int hierarchy = arr.length / 2 - 1;

        // 从根开始设置左右叶子节点
        for (int parentIndex = 0; parentIndex < hierarchy; parentIndex++) {
            tree.get(parentIndex).left = tree.get(parentIndex * 2 + 1);
            tree.get(parentIndex).right = tree.get(parentIndex * 2 + 2);
        }

        // 最后一个父节点
        tree.get(hierarchy).left = tree.get(hierarchy * 2 + 1);
        if(arr.length % 2 == 1) {
            tree.get(hierarchy).right = tree.get(hierarchy * 2 + 2);
        }
        return tree.get(0);
    }
}
