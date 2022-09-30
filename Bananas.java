public class Bananas {
    public static void main (String[] args) {
        int[] pile  = {3,6,7,11};
        int[] pile2 = {30,11,23,4,20};
        int[] pile3 = {30,11,23,4,20};

        System.out.println(minEatingSpeed(pile, 8));
        System.out.println(minEatingSpeed(pile2, 5));
        System.out.println(minEatingSpeed(pile3, 6));


    }

    public static int minEatingSpeed(int[] piles, int h) {
        int left = findMin(piles);
        int right = findMax(piles);
        
        while (left <= right) {
            int mid_point = left + (right - left) / 2;
            if (isValid(piles, mid_point, h)) right = mid_point - 1;
            else left = mid_point + 1;
            
        }
        return left;
        
    }
    
    public static boolean isValid(int[] piles, int mid, int hours) {
        int count = 0;
        for (int n : piles) {
            count += Math.ceilDiv(n, mid);
        }
        return count <= hours;
    }
    
    public static int findMin(int[] piles) {
        int min = piles[0];
        for (int n : piles) {
            if (n < min) min = n;
        }
        return min;
    }

    public static int findMax(int[] piles) {
        int max = piles[0];
        for (int n : piles) {
            if (n > max) max = n;
        }
        return max;
    }
    
}
