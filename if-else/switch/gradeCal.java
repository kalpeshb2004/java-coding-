
import java.util.Scanner;

class gradeCal {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();

        if (a > 90) {
            System.out.println("student passed with A grades");
        } else if (a > 75 && a < 89) {
            System.out.println("student passed with B grades");
        } else if (a > 60 && a < 74) {
            System.out.println("student passed with C grades");
        } else if (a > 40 && a < 59) {
            System.out.println("student passed with  grades");
        } else {
            System.out.println("failed");
        }

    }
}