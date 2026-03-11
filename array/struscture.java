
import java.util.Scanner;

public class struscture {
  public static void main(String[] args) {
      Scanner x = new Scanner(System.in);
      int size = x.nextInt();

      int number[] = new int[size];  // array ka object banaya aur size lega "size" varaible me via input
      
      //array input
    for (int i = 0; i < size; i++) {
        number[i] = x.nextInt();
    }

    //array output
    for (int i = 0; i < size; i++) {
        System.out.println(number[i]);
    }


  }  
}
