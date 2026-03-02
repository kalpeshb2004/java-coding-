
import java.util.Scanner;

public class function{

    public static int sum(int a,int b) {
        int sum = a + b;
        return sum;
    }


    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();

        int sum = sum(a , b);
        System.out.println(sum);

    }
}