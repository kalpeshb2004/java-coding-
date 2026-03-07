import java.util.Scanner;

public class powerOf2 {
        public static void main(String[] args) {
                Scanner x= new Scanner(System.in);
                    int num = x.nextInt();
                    
                    if (num % 2 != 0) {
                        System.out.println("entered number is not power of 2");
                    }else {
                        System.out.println("entered number is power of 2");
                    }
         }
}
