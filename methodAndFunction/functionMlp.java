
import java.util.Scanner;

public class functionMlp {
    
    public static int multiply(int a,int b) {
        int mul = a*b;
        return mul;
    }

    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();

        int mul = multiply(a,b);
        System.out.println(mul);

    }

    
}
