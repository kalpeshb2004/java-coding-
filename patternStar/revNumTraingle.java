
import java.util.Scanner;

public class revNumTraingle {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();

        //outer decrement loop will print reverse row
        for (int i = n; i>=1; i--) {
            //inner loop for star
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
