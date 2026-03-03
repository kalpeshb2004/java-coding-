
import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int size = x.nextInt();
         
        int number[] = new int[size];

        //input
        for (int i = 0; i < size; i++) {
            number[i] =  x.nextInt();
        }

        //int min = Integer.MIN_VALUE; ye return karega -21475039 something bec ye cond check karega aur java ki sbase min aur max value dega 
       // int max = Integer.MAX_VALUE; same
            int min = number[0];
            int max = number[0];
        //output
        for (int i = 0; i <number.length; i++) {
            if(number[i] < min){
                min = number[i];
            }
            if(number[i] > max){
                max = number[i];
            }
        }

        System.out.println("min :" +min);
        System.out.println("max :" +max);
        
    }
}
