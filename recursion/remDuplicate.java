public class remDuplicate {
    //creating boolean array for string char and for iteration
    public static boolean map[] = new boolean[26];

    //method
    public static void remDuplicate( String str , int idx , String newStr){
            if(idx == str.length()){
                System.out.println(newStr);
                return;
            }

            //currentChar stores str cuurent character
        char currentChar = str.charAt(idx);

        //map[currentChar - 'a'] : if cuurentChar diff value - a then result 1 otherwise 0 
        if(map[currentChar - 'a']){
            remDuplicate(str, idx+1, newStr);
        }else {
            newStr += currentChar;
            map[currentChar - 'a'] = true;
            remDuplicate(str, idx+1, newStr);
        }
    }


    public static void main(String[] args) {
        String str = "aabbcccdddd";
        remDuplicate(str, 0, "");
    }
}
