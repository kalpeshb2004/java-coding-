import java.util.Scanner;

public class indexValue {
   public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int row = x.nextInt();
        int cols = x.nextInt();

        int number[][] = new int[row][cols];
        
        //input row
        for (int i = 0; i < row; i++) {
            //cols
            for (int j = 0; j < cols; j++) {
                number[i][j] = x.nextInt();
            }
        }

        int a = x.nextInt();

        //output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                if(number[i][j] == a) {
                    System.out.println("a is at location : " + i + " " + j);
                }
            }
        }
   }
    
}
