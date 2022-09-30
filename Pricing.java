import java.util.Scanner;

public class Pricing {

    public static void main(String[] args) {
        /*
         * Getting Inputs
         */
        Scanner sc = new Scanner(System.in);
        long cost = sc.nextLong();
        sc.close();

        binarySearch(cost);
    }

    public static void binarySearch(long cost) {
        long low = 0;
        long high = 1000000;

        while (low < high) {
            long mid = (low + high + 1) / 2;
            if (getCost(mid) > cost) 
                high = mid-1;
            else 
                low = mid;
        }
        
        System.out.println(low);
    }

    //works
    public static long getCost(long quantity) {
        long cost = 0;
        for (long i = 1; i < quantity; ++i)  {
            cost += (i * (quantity/i));
        }
        return cost;
    }
    
}
