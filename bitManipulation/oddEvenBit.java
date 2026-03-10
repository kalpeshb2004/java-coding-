
import java.util.Scanner;

public class oddEvenBit {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        int n = x.nextInt();
        

        if((n & 1) == 0){
            System.out.println("bit is even");
        }else{
            System.out.println("bit is odd");
        }
    }
}
