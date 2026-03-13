// recursion : the function calls itself again and again

public class structureREC {
    //recursive function 
public static void print(int n){
    // condition to stop recursion 
    if(n == 0){
        return;
    }
    System.out.println(n);
    print(n-1);
}

    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
}
