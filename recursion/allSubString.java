//*** IMP from exam point of view 
public class allSubString {
    public static void subSequence(String str , int i , String newStr){
        if(i == str.length()){
            System.out.println(newStr);
            return;
        }

        //get specific char from entire String
        char currentChar = str.charAt(i);

        //char ko add hona he then method ko call karo aur newStr + currentChar add karo
        subSequence(str, i+1, newStr+currentChar);

        //char ko add nahi hona he then method ko call karo aur newStr khali chod do
        subSequence(str, i+1, newStr);
    }
    public static void main(String[] args) {
        String str = "abc";
        subSequence(str, 0, "");
    }
}
