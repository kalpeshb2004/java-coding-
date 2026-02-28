
import java.util.Scanner;

public class dimondTRI {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        int n= x.nextInt();

        //1st outer loop for uperside
        for (int i=1; i<=n; i++)  {
            //1st inner loop for spaces
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
                
            System.out.println();
        }

        //2st outer loop for lower side
        for (int i=n; i>=1; i--)  {
            //1st inner loop for spaces
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
                
            System.out.println();
        }

    }
}
