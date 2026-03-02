import java.util.*;
public class voting {
    public static int votingof18(int age) {
        if (age > 18) {
            System.out.println("user is elgible to vote");
        }else {
            System.out.println("user is not elgible to vote");
        }
        return age;
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int age = x.nextInt();

        votingof18(age);
    }
}
