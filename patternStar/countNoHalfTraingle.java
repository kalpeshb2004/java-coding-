
import java.util.Scanner;

public class countNoHalfTraingle {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();

        int number = 1;

        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                //cell
                System.out.print(number+" "); // number++ not here, bec it will keep printing same number
                number++;
            }
            System.out.println();
        }
    }
}
