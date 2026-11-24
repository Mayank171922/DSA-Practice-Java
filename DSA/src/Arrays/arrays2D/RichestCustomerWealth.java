package Arrays.arrays2D;

public class RichestCustomerWealth {

    static void main() {
        int[][] accounts = {
                {1,2,3},
                {4,7,6},
                {9,3,4},
                {7,6,9}
        };

        int ans = maximumWealth(accounts);
        System.out.println("The maximum wealth of customer is: "+ans);

    }

     static int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;

        for (int row = 0; row < accounts.length; row++) {
            int wealth = 0;
            for (int col = 0; col < accounts[row].length; col++) {

                wealth += accounts[row][col];
            }
            maxWealth = Math.max(wealth,maxWealth);

        }
        return maxWealth;
    }
}
