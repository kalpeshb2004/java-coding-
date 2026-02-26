import java.util.*;

class monthsCal {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
       
        int a = x.nextInt();

        switch (a) {
            case 1 : System.err.println("January");
            break;

             case 2 : System.err.println("february");
            break;

             case 3 : System.err.println("march");
            break;

             case 4 : System.err.println("April");
            break;

             case 5 : System.err.println("May");
            break;

             case 6 : System.err.println("June");
            break;

             case 7 : System.err.println("July");
            break;

             case 8 : System.err.println("august");
            break;

             case 9 : System.err.println("september");
            break;

             case 10 : System.err.println("octomber");
            break;

             case 11 : System.err.println("november");
            break;

             case 12 : System.err.println("December");
            break;

            default:
               System.out.println("Invalid request");
        }


    }
}