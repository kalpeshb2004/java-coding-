
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int size = x.nextInt();

        int number[] = new int[size];

        for (int i = 0; i < size; i++) {
            number[i] = x.nextInt();
        }

        for (int i = 0; i < number.length; i++) {
            int temp = number[i] % 10;
            number[i] = number[i] * 10 + temp;
            number[i] = number[i] / 10;
        }
        System.out.print("reverse array is :" + " "+number[i]);
    }
}
