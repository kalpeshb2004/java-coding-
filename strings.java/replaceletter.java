import java.util.*;

public class replaceletter {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        String name = x.nextLine();
        
        String result = "";

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'e'){
            result += "i";
            }else {
                result += name.charAt(i);
            }
        }
        System.out.println(result);
    }
}
