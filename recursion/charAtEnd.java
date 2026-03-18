public class charAtEnd {
    public static void print(int i , String str , int count, char element,String newStr){
        if(i == str.length()){
            for ( i = 0; i < count; i++) {
                newStr += element;
            }
            System.out.println(newStr);
            return;
        }
        //commit
        char currentChar = str.charAt(i);
        if(currentChar == element){
            count++;
            print(i+1, str, count, element, newStr);
        }else{
            newStr += currentChar;
            print(i+1, str, count, element, newStr);
        }
        
        //another commit day
    }
    public static void main(String[] args) {
        String str = "abcxdfrxxvx";
        print(0, str, 0, 'x', " ");
        
    }
}
