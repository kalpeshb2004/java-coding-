public class nokiaKeypad {
    //keypad char combination array
    public static String[] keypad = {"." , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tu" , "vwx" , "yz"};

    public static void print(String str , int idx , String combination){
        if(idx == str.length()){
            System.out.print(combination);
            return;
        }
        char currentChar = str.charAt(idx);
        //  keypad array me jo specific index(surrentChar) - 0 aayega us index me konsi vlaue store he o mapping me store he
        String mapping = keypad[currentChar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            //mapping.charAt(i) ye mujhe mapping me jo value store he uska ek char dega o jake new combination string me store hoga 
            print(str, idx+1, combination+mapping.charAt(i));
        }


    }

    public static void main(String[] args) {
        String str = "6";
        print(str, 0, "");
    }
}
