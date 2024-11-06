package Google;
// This Java program calculates the number of unique paths in an m x n grid, 
// where you can only move either down or right at any point. 
// The goal is to reach the bottom-right corner of the grid from the top-left corner. 
// The program also handles multiple test cases as specified by user input.

import java.util.Scanner;

class Main {

    static final int MOD = 1000000007;

    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        // Initialize the first row and first column
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        // Fill the dp table
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % MOD;
            }
        }

        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for (int t = 0; t < T; t++) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println(uniquePaths(m, n));
        }

        scanner.close();
    }
}



