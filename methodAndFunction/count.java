
import java.util.Scanner;

public class count {
    public static void countPosNegZro(int num , char choice) {
        
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
                int num;
                int choice;

            int pos = 0;
            int neg = 0;
            int zro = 0;
            do {
                 num = x.nextInt();
                 choice = x.next().charAt(0);
    
            if(num > 0){
                pos++; 
            }else if (num < 0) {
                neg++;
            }else {
                zro++;   
            }
        }while (choice == 'y');

             System.out.println("positive :" + pos);
             System.out.println("negative :" + neg);
             System.out.println("zero :" +zro);

        }
}
