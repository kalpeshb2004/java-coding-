
import java.util.Scanner;

public class average {
    public static void averageOf3(int a , int b,int c) {
        int average = (a + b + c)/3;
        System.out.println("average : " + average);
    }

    public static void main(String[] args) {
        Scanner x =new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();
        int c = x.nextInt();

       averageOf3(a, b, c);
        

    }
}
