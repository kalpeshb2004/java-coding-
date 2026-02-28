
import java.util.Scanner;

public class solidRhombus {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();

        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop for spaces
            int spaces = n-i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            //inner loop for stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
