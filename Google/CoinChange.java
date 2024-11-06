package Google;
// The CoinChange program is a solution to the classic Coin Change Problem, 
// where the objective is to find the minimum number of coins needed to make up a given amount. 
// If it is not possible to make up that amount, the function returns -1.

import java.util.Arrays;
import java.util.Scanner;

public class CoinChange { 
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int coin : coins) {
            for (int x = coin; x <= amount; x++) {
                dp[x] = Math.min(dp[x], dp[x - coin] + 1);
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt(); // Read the size of the coins array
        int[] coins = new int[N]; // Initialize the coins array
        
        for (int i = 0; i < N; i++) {
            coins[i] = scanner.nextInt(); // Read each coin denomination
        }
        
        int amount = scanner.nextInt(); // Read the amount
        
        System.out.println(coinChange(coins, amount)); // Print the result

        scanner.close(); // Close the scanner
    }
}