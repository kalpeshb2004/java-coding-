
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int size = x.nextInt();

        int number[] = new int[size];

        for (int i = 0; i < size; i++) {
            number[i] = x.nextInt();
        }

       for (int i = number.length - 1; i >= 0; i--) {
           System.out.print("reverse array is: " + number[i] +" ");
       }
    }
}
