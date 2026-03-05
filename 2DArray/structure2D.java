import java.util.*;

public class structure2D {
    public static void main(String[] args) {
            Scanner x = new Scanner(System.in);
    //input row and cols size
    int row = x.nextInt();
    int cols = x.nextInt();

    //array creating
    int number[][] = new int[row][cols];

    //input array element
    //row
    for(int i=0; i<row; i++){
        //cols
        for (int j=0; j<cols; j++) {
            number[i][j] = x.nextInt();
        }
    }

    //output
    for(int i=0; i<row; i++){
        //cols
        for (int j=0; j<cols; j++) {
            System.out.print(number[i][j] + " ");
        }
        System.out.println();
    }
    }
      
}