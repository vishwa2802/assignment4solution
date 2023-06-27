public class StaircaseRows {
    
    public static int arrangeCoins(int n) {
        int rows = 0;
        int coins = 1;
        
        while (n >= coins) {
            n -= coins;
            coins++;
            rows++;
        }
        
        return rows;
    }

    public static void main(String[] args) {
        int n = 5;
        
        int completeRows = arrangeCoins(n);
        
        System.out.println("Number of complete rows: " + completeRows);
    }
}
