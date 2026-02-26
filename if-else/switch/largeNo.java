
import java.util.*;


class largeNo {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in); 

        int a = x.nextInt();
        int b = x.nextInt();
        int c = x.nextInt();

        if (a > b && a > c) {
            System.out.println("a is greater");
        } else if (b > a && b > c ) {
            System.out.println("b is greater");
        } else {
            System.out.println("c is gerater");
        }
    }
}