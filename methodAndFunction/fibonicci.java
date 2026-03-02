
import java.util.Scanner;

public class fibonicci {
    public static void fibonicciOfNo(int n) {
        int sum = 0;
        int a= 0;
        int b= 1;
        for (int i = 0; i <=n; i++) {
           sum = a+b;
           a=b;
           b=sum;
           System.out.println(a +" ");
        }
    }

    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        int n = x.nextInt();

        fibonicciOfNo(n);
    }
}
