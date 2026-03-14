public class reverse {
    public static void print(String str , int idx){
      if(idx == 0){
        System.out.print(str.charAt(idx));
        return;
      }
        System.out.print(str.charAt(idx));
        //loop that call string in decrement position
        print(str,idx-1);
    }
    public static void main(String[] args) {
        String str = "abcd";
        print(str, str.length()-1);
    }
}
