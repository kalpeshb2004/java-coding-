import java.util.*;

public class newPractice {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("enter string :");
        String str = x.nextLine();

        System.out.println("string :" + str);
        System.out.println("string :" + str.toLowerCase());
        System.out.println("string :" + str.toUpperCase());
        System.out.println("string :" + str.length());
        System.out.println("string :" + str.concat("java"));
        System.out.println("string :" + str.charAt(0));

        StringBuffer sb = new StringBuffer();

        sb.append("hello");
        System.out.println("stringBuffer is :" +sb);

        sb.insert(5,"java");
        System.out.println("stringBuffer is :" +sb);

        sb.replace(2,5,"c++");
        System.out.println("stringBuffer is :" +sb);

        sb.delete(2, 8);
        System.out.println("stringBuffer is :" +sb);
    }
}
