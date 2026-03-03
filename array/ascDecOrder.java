
import java.util.Scanner;

public class ascDecOrder {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int size = x.nextInt();

        //array object
        int number[] = new int[size];

        boolean isascending = true;

        //input
        for (int i = 0; i < size; i++) {
            number[i] = x.nextInt();
        }

        //Ascending or not condition
        for (int i = 0; i < number.length - 1; i++) { // number.length - 1 bec i = 0 to n-1
            if (number[i] > number[i+1] ) { // currect value i.e number[i] is greater that current value + 1 i.e number[i+1]
                isascending = false;
            }
        }

        if(isascending){
            System.out.println("order of number is in ascending order");
        }else{
            System.out.println("order of number is not in ascending order");
        }
    }
}
