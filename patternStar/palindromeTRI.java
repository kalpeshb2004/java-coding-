
import java.util.Scanner;

public class palindromeTRI {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();

        //outer loop
        for (int i = 1; i <= n; i++) {

            //1st inner loop for spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //2nd inner loop for left side reverse like 2 to i
            for (int j = i; j >=1; j--) {
                System.out.print(j);
            }

            //3rd inner loop for right side like 1 to i
            for (int j = 2; j <= i; j++) {  // here we take j=2 bec 1 already taken in 1st loop
                System.out.print(j);
            }
            System.out.println();
        } 
    }
}
