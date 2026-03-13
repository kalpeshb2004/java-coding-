public class xN {
    public static int print(int x,int n){
        if(x==0){
            return 1;
        }
        if(n==0){
            return 1;
        }
        int result1 = print(x, n-1);
        int result2 = x * result1;
        return result2;
    }
    public static void main(String[] args) {
       int ans =  print(2, 5);
        System.out.println(ans);
    }
}
