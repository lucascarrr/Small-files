public class Candles {
    public static void main(String[] args) {
        int[] candles = {2,5};
        System.out.println(maximumCandles(candles, 11));
        
    }

    public static int maximumCandles(int[] candies, long k) {
        int left = 0;
        int right = findMax(candies);

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isValid(candies, mid, k)) left = mid + 1;
            else right = mid - 1;
        }
        
        return isValid(candies, left, k) ? left : left-1;
    }
    
    public static boolean isValid(int[] candies, int validation_size, long k) {
        if (validation_size == 0) return true;
        int count = 0; 
        for (int n : candies) {
            count += (n / validation_size);
        }
        return count >= k;
    }

    public static int findMax(int[] candies) {
        int max = candies[0];
        for (int n : candies) {
            if (n > max) max = n;
        }
        return max;
    
    }
}