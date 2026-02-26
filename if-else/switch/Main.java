import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch (num % 2) {
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
                break;

                /* condition num % 2 will verify and if number is odd then reminder = 1 then case 1 will execute and same vice versa */
        }
    }
}