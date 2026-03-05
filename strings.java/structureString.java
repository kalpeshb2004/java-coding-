
import java.util.Scanner;

public class structureString {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        //input
        String fname = x.nextLine();
        String lname = x.nextLine();

        //concatenation.
        String Cname = fname +" "+ lname ;
        System.out.println("Cname :" + Cname );

        //length
        System.out.println("length :" + Cname.length());

        //charAt each char print separate
        for (int i = 0; i < Cname.length(); i++) {
            System.out.print(" " +Cname.charAt(i));
        }

       
        

    }
}
