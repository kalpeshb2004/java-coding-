
import java.util.Scanner;

public class sumRow {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        int row= x.nextInt();
        int cols= x.nextInt();

        int number[][] = new int[row][cols];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                number[i][j] = x.nextInt();
            }
        }
         
        
        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum = sum + number[i][j];
          }
          System.out.println("sum of ech row is :" + sum);
        }
        
    }
}
