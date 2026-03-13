public class xN1 {
    public static int print(int x,int n){
        if(x==0){
            return 1;
        }
        if(n==0){
            return 1;
        }
        //all program is same just stack hight = logn
        //if n is even
        if(n % 2 == 0){
            return print(x, n/2) * print(x, n/2);
        }else{
            return print(x, n/2) * print(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
       int ans =  print(2, 5);
        System.out.println(ans);
    }
}

