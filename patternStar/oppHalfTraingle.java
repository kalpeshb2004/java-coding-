import java.util.Scanner;

public class oppHalfTraingle {
    public static void main(String[] args) {
        Scanner x = new  Scanner(System.in);
    int n = x.nextInt();

    //outer loop for print only rows (move to the next line)
    for(int i=1; i<=n; i++) {
       //1st inner loop for print spaces bec its oposite 180 degree from normal traingle
       for(int j=1; j<=n-i; j++) {
            System.out.print(" ");
       }

       //2nd inner loop for print stars
       for(int j=1; j<=i; j++) {
        System.out.print("*");
       }

       System.out.println();
    }


   }
    
}

