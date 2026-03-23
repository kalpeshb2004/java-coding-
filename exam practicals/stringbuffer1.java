import java.util.*;

public class stringbuffer1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String str = x.next();
        
        //string
        System.out.println("string :" + str);
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toLowerCase());

        //stringBuffer
        StringBuffer sb = new StringBuffer("java");

        sb.append("programming");
        System.out.println(sb);

        sb.insert(5 , "lang");
        System.out.println(sb);

        sb.replace(0,4,"python");
        System.out.println(sb);

        sb.delete(5,9);
        System.out.println(sb);

        
    }
}