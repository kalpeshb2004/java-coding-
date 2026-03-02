
import java.util.Scanner;

public class factorial {
    public static void calFactorial(int n) {
        int fact = 1;

        for (int i = n; i>=1; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        int n = x.nextInt();

        calFactorial(n);

    }
}
