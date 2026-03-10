
import java.util.Scanner;

public class clearBit {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        int n = x.nextInt();
        int pos = x.nextInt();
        int bitmask = 1<<pos;

        int number = ~(bitmask) & n;
        System.out.println(number);
    }
}
