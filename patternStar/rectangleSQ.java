import java.util.*;

public class rectangleSQ {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int m = x.nextInt();
        int n = x.nextInt();

        //outer loop
        for(int i=1; i<=m; i++) {
          //inner loop
            for(int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
