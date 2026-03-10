
import java.util.Scanner;

public class updateBit {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        int op = x.nextInt();
        int n = x.nextInt();
        int pos = x.nextInt();
        int bitmask = 1<<pos;

        if(op == 1){
            int number = bitmask | n;
            System.out.println(number);
        } else {
            int number = ~(bitmask) & n;
            System.out.println(number);
        }

        
    }
}
