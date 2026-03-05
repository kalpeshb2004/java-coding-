
import java.util.Scanner;

public class convert {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        int row= x.nextInt();
        int cols= x.nextInt();

        int number[][] = new int[row][cols];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                 number[i][j]= x.nextInt();
            }
           
        }

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(number[j][i] + " ");
            }
            System.out.println();
        }
    
    }
}
