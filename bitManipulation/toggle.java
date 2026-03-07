
import java.util.Scanner;

public class toggle {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        int num = x.nextInt();
        int pos = x.nextInt();
        int bitmask = 1<<pos;

        int xor = (bitmask & ~(num)) | (~(bitmask) & num);
        System.out.println(xor);
   }
}
