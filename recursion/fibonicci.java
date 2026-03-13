public class fibonicci {
    public static void print(int a , int b , int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        print(b, c, n-1);
    }

    public static void main(String[] args) {
       int a = 0;
       int b = 1;
       System.out.println(0);
       System.out.println(1);
       int n = 7;
       print(a, b, n-2);
    }
}
