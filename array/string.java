import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int size = x.nextInt();
        x.nextLine(); // clear leftover newline

        String name[] = new String[size];

        // input
        for (int i = 0; i < size; i++) {
            name[i] = x.nextLine();
        }

        // output
        for (int i = 0; i < size; i++) {
            System.out.println(name[i]);
        }
    }
}