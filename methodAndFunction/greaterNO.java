
import java.util.Scanner;

public class greaterNO {
    public static int greaterOf2No(int a,int b) 
    {
        if(a > b) {
            System.out.println(a);
            return a;
        }else{
            System.out.println(b);
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b =x.nextInt();

        greaterOf2No(a, b);
        
    }
}
