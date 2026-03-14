public class firstLast {
    //static variable that can declare outside of main func
    public static int first = -1;
    public static int last = -1;

    public static void print(String str, int i, char element){
        
        if (i == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        //from entire string it gets only specific char using charAt
        int currentChar = str.charAt(i);

        if(currentChar == element){
            if(first == -1){
                first = i;
            }else {
                last = i;
            }
        }
        print(str, i+1, element);
    }

    public static void main(String[] args) {
        String str = "abcdeaahiakaanopaatv";
        print(str, 0, 'a');
    }
}
