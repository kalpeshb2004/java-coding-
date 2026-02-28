
import java.util.Scanner;

public class butterfly {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        int n = x.nextInt();

        //1st outer loop
        for (int i = 1; i <= n; i++) {
            //1st inner loop for left side stars
            for (int j=1; j <= i; j++) {
                System.out.print("*");
            }

            //2nd inner loop for spaces
            int spaces = 2*(n-i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            
            //3rd inner loop for right side stars
            for (int j = 1; j <= i; j++) {
                System.err.print("*");
            }
            System.out.println();
        }
        

        //2nd outer loop for rev pattern
        //outer loop
        for (int i = n; i >= 1; i--) {
            //1st inner loop for left side stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //2nd inner loop for spaces
            int spaces = 2*(n-i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            
            //3rd inner loop for right side stars
            for (int j = 1; j <= i; j++) {
                System.err.print("*");
            }
             System.out.println();
        }
       
    }
}
