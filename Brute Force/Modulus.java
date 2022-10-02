import java.util.Scanner;

public class Modulus {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Z = sc.nextInt();
        sc.close();

        int count = 0;

        for (int X = 1; X < N; X++) {
            for (int Y = X; Y < N; Y++) {
                if ((X * Y) % N == Z) {
                    if (Y == X) count += 1;
                    else count +=2; 
                }
            }
        }
        System.out.println(count);
    }
}
