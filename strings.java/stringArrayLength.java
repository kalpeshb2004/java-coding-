
import java.util.Scanner;

public class stringArrayLength {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        int size = x.nextInt();
        x.nextLine(); // bec conversion from stint to int gets difficult.

        // array creation
        String name[] = new String[size];

        int sum = 0;
        for (int i = 0; i <size; i++) {
            name[i] = x.nextLine(); // array input
            sum = sum + name[i].length(); // array length calculation
        }
        System.out.println(sum);

    }
}
