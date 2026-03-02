
import java.util.Scanner;

public class circumference {
    public static int circumferenceOfcircle(int r) {
        double C = 2 * 3.14 * r ;
        System.out.printf("Circumference of circle : %.2f", C);
        return r;
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int r = x.nextInt();

         circumferenceOfcircle(r);
        
    }
}