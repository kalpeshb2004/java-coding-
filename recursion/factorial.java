public class factorial {
    public static void print(int n,int fact){
        if(n==0){
            System.out.println(fact);
            return;

        }
        fact = fact * n;
        print(n-1,fact);
    }
    public static void main(String[] args) {
        print(5, 1);
        
    }
}
