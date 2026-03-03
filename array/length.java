
import java.util.Scanner;

public class length {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int size = x.nextInt();

        int number[] = new int[size]; // array object created .

        //input 
        for (int i = 0; i < number.length; i++) {
            number[i] = x.nextInt();  // number[i] is inputed value and i is index value.
        }

        //searching input
        int a = x.nextInt();

        //output
        for (int i = 0; i < number.length; i++) {
            if(number[i] == a) {
                System.out.println("a is gound at: " +i);
            }
        }


    }
}
