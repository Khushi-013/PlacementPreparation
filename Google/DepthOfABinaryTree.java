package Google;
// TreeNode class: Represents a node in the binary tree.
// Solution class: Contains the maxDepth method to calculate the maximum depth of the binary tree.
// Main class:
// Takes user input for the number of nodes and each node's value.
// Builds the binary tree in a level-wise manner using insertLevelOrder.
// Calls the maxDepth function from the Solution class to compute the tree depth.

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}

public class DepthOfABinaryTree {
    // Function to insert nodes level-wise in the binary tree
    public static TreeNode insertLevelOrder(int[] arr, int n) {
        if (n == 0) return null;
        
        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        
        while (!queue.isEmpty() && i < n) {
            TreeNode current = queue.poll();
            
            // Insert left child
            if (i < n) {
                current.left = new TreeNode(arr[i++]);
                queue.add(current.left);
            }
            
            // Insert right child
            if (i < n) {
                current.right = new TreeNode(arr[i++]);
                queue.add(current.right);
            }
        }
        
        return root;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number of nodes in the tree:");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the nodes values:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Create tree from input array
        TreeNode root = insertLevelOrder(arr, n);

        // Calculate max depth
        Solution solution = new Solution();
        int depth = solution.maxDepth(root);
        
        System.out.println("Maximum depth of the binary tree: " + depth);
        
        scanner.close();
    }
}
