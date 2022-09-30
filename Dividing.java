import java.util.Scanner;

public class Dividing {

    public static void binarySearch(int[] planks, int required) {
        int low = 0;
        int high = 10000000;

        while (low < high) {
            int mid = (low + high + 1) / 2;
            if (checkLength(planks, mid) < required) high = mid - 1;
            else low = mid;
        }
        System.out.println(low);
    }

    public static int checkLength(int[] planks, int test_length) {
        int count = 0;
        for (int plank : planks) {
            count += plank / test_length;
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int[] planks = new int[sc.nextInt()];
        for (int i = 0; i < planks.length; i++) {
            planks[i] = sc.nextInt();
        }   
        int required = sc.nextInt();
        sc.close();

        binarySearch(planks, required);
        
    }

}
