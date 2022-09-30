import java.util.Scanner;

public class Modulus {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Z = sc.nextInt();
        sc.close();

        int count = 0;
        for (int X = 0; X < N; X++) {
            for (int Y = 0; Y < N; Y++) {
                if ((X * Y) % N == Z) { count += 1;}
            }
        }
        System.out.println(count);

    }
}
