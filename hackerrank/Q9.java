import java.util.*;


public class Q9 {

    public static void main(String[] args) {
       Scanner x= new Scanner(System.in);
       int n = 1;
       
       while(x.hasNext()) //hasNext() method use to iterate a loop until end of input
            {
                System.out.println(n++ + " " + x.nextLine());
            }
            x.close();
    }
}
/*Sample Input

Hello world
I am a file
Read me until end-of-file.

Sample Output

1 Hello world
2 I am a file
3 Read me until end-of-file. */