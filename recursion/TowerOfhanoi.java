public class TowerOfhanoi {
    public static void print(int n, String src , String helper , String dest ){
        if(n==1){
            System.out.println("Transfer disk " + n + " from " + src + " To " + dest);
            return;
        }
        // n-1 : ek rod me 2 disk hogi to ek time pe ek hi nikalegi 
        //src to helper send karana he to ab helper hamara dest he 
        print(n-1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src + "  To" + dest);
        //
        print(n-1,helper, src, dest);
    }
    public static void main(String[] args) {
        int n = 2;
        print(n, "S", "H", "D");
    }
}
