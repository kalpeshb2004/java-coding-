import java.util.*;

public class GCD {
    public static void GCDOf2(int a, int b) {
        while (b != 0) {
            int temp = b;
            b= a % b;
            a = temp;
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();

        GCDOf2(a, b);
    }
}
