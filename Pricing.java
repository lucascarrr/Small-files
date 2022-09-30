import java.util.Scanner;

public class Pricing {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long currency = sc.nextLong();
        sc.close();
        System.out.println(maxGems(currency));

        
    }

    public static long maxGems(long currency) {
        long lo = 0;
        long hi = 10000;

        while (lo < hi) {
            long mid = (lo + hi + 1) / 2; 
            if (gemCost(mid) > currency) {
                hi = mid - 1;
            }
            else {
                lo = mid;
            }
        }
        return lo;
    }


    /*
     * Calculates the cost of buying N amount of gems, returns cost as an int.
     */
    public static long gemCost(long number_of_gems) {
        long cost = 0;

        for (int i = 1; i < number_of_gems; ++i) {
            cost += i * (number_of_gems / i);
        }
        return cost;
    }
    
}
