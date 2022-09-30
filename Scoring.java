import java.util.ArrayList;
import java.util.Scanner;

public class Scoring {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>(array_size);
        for (int i = 0; i < array_size; i++) {  numbers.add(sc.nextInt());  }
        int target = sc.nextInt();
        sc.close();
        
        int current_score = 1;
       
    }
    
}
