// Given the root of a binary tree, determine if it is a complete binary tree.

// In a complete binary tree, every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.

package Leetcode;

import java.util.LinkedList;
import java.util.Queue;
// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) { this.val = val; }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean isCompleteTree(TreeNode root) {
        if (root == null) return true;

        Queue<TreeNode> q = new LinkedList<>();
        boolean nullSeen = false;
        q.add(root);
        
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            if (curr == null) {
                nullSeen = true;
            } else {
                if (nullSeen) return false;
                q.add(curr.left);
                q.add(curr.right);
            }
        }
        return true;
    }
}