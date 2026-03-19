
import java.util.HashSet;

public class sameSubstring {
    public static void subSameSequence(String str , int i , String newStr , HashSet<String> set){
        if(i == str.length()){
            if(set.contains(newStr)){
                return;
            }else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        //get specific char from entire String
        char currentChar = str.charAt(i);

        //char ko add hona he then method ko call karo aur newStr + currentChar add karo
        subSameSequence(str, i+1, newStr+currentChar, set);

        //char ko add nahi hona he then method ko call karo aur newStr khali chod do
        subSameSequence(str, i+1, newStr , set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subSameSequence(str, 0, "", set);
    }
}
