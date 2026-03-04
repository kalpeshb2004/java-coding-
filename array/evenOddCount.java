import java.util.*;
public class evenOddCount{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int size = x.nextInt();

        int number[] = new int[size];
        int even = 0;
        int odd = 0;
        for (int i = 0; i < size; i++) {
            number[i] = x.nextInt();
        }

        for (int i = 0; i < number.length; i++) {
            if(number[i] % 2 == 0) {
               even++;
            } else {
                odd++;
            }
        }
        System.out.println("even numberis :" + even);
        System.out.println("odd n umber is :" + odd);
    }
}