import java.util.*;


class leapYear {
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        int a = x.nextInt();

        if (a % 400 == 0) {
            System.out.println("This is leap year");
        } else {
            System.out.println("This is not leap year");
        }

        /*logic to find not leap year.
        if (a % 4 == 0 && a % 100 != 0)
          system.out.println("this is not leap year")
        */ 
        
    }
}