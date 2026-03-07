//update is the combination of set and clear bit
import java.util.Scanner;

public class updateBitExample {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        //which operation wants to perform i.e 0 to 1 : set OR 1 to 0 : clear 
        int ope = x.nextInt();
        int n = 5;
        int pos = 1;
        int bitmask = 1<<pos;

        if(ope == 1){
            //set operation
            int number = bitmask | n;
            System.out.println(number);
        }else {
            //clear
            int negation = ~(bitmask);
            int number = negation & n;
            System.out.println(number);
        }

    }
}
