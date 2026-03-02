import java.util.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int bsum = 1;
            
            bsum += bsum * 2;
            int result = a + (bsum * b);

            System.out.println(result +" ");
            
        }
        in.close();
    }
}