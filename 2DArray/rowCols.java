
import java.util.Scanner;

public class rowCols {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        int row=  x.nextInt();
        int cols= x.nextInt();

        int number[][] = new int[row][cols];

        //input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                number[i][j] = x.nextInt();
            }
        }

        //output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }

    }
}
