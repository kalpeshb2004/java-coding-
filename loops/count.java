
import java.util.Scanner;

class count {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int num = x.nextInt();
  
        int count = 0;

        while(num != 0 ) {
             num = num / 10; // remove digits until 0 
             count++; // count by 1
        }
        System.out.println(count);

    }
}