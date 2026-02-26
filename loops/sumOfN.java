
import java.util.Scanner;

public class sumOfN {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int num = x.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
