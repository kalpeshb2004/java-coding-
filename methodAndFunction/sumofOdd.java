import java.util.*;

public class sumofOdd {
    public static int sumofOddNo(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                result += i;
            } 
        }
        System.out.println("sum: " +result);
        return n;
    }

    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        int n = x.nextInt();

        sumofOddNo(n);
    }
}
