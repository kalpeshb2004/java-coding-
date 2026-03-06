import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Q9 {

    public static void main(String[] args) {
       Scanner x= new Scanner(System.in);
       int n =1;
       
       while(x.hasNext()) {
        System.out.println(n++ + " " + x.nextLine());
       }
       x.close();
    }
}