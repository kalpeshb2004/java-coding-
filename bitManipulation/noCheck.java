
import java.util.Scanner;

public class noCheck {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        int n = x.nextInt();
        int pos = x.nextInt();
        int bitmask= 1<<pos;

        int number = bitmask & n;
        if(number == 0){
            System.out.println("bit is 0");
        }else{
            System.out.println("bit is not 0");
        }
    }
}
