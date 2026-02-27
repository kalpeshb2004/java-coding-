
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int num = x.nextInt();
        
        int rev = 0;
        
        while (num != 0) {
             int temp = num % 10; // will gives last digit
             rev = rev * 10 + temp; // shift values from left to right and add given above values in  left sde
             num = num / 10; // last digits still on right side then it will remove it .

        }
        System.out.println(rev);
    }
}
