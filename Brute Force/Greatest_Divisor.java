
public class Greatest_Divisor {
    public static void main(String[] args) {
        System.out.println(GCD(252, 105));
        
    }
    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a%b);       

    }
    
}
