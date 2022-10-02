import java.util.Arrays;
import java.util.Scanner;

public class Scoring {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int[] numbers = new int[array_size];
        for (int i = 0; i < array_size; i++) { 
             numbers[i] = (sc.nextInt());  }
        int target = sc.nextInt();
        sc.close();

        int[] current_values = new int[] {1};

        for (int element : numbers) {
            int[] new_array = new int[current_values.length * 2];
            int counter = 0;
            for (int k : current_values) {
                int add = k + element;
                new_array[counter] = add;
                counter++;   
            
                int multiply = k * element;
                new_array[counter] = multiply;
                counter++;
                
            }
            current_values = new_array;
        }       

        int max = 0;
        for (int item : current_values) {
            if (item > max && item <= target) max = item;
        }
        System.out.println(max);

    }
    
}
