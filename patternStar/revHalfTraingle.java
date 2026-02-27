import java.util.*;

public class revHalfTraingle {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        
        //outer loop
        for (int i = n; i >= 1; i--) {
            //inner loop
            for (int j = 1;j <= i;j++) {
                //cell
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
