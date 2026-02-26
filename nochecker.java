
import java.util.*;


class nochecker {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        
        if (a == 0) {
            System.out.println("value is zero");
        } else if (a > 0) {
            System.out.println("value is positive");
        } else {
            System.out.println("value is negative");
        }
    }
}