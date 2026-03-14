public class strictlySorting {
    public static boolean print(int arr[], int i){

       if(i == arr.length-1){
        return true;
       }
        if(arr[i] < arr[i+1]){
            //array is sorted 
            return print(arr, i+1);
        }else{
            // array is not sorted 
           return false;
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
       System.out.println(print(arr, 0));
    }
}

/*
THIS is my simple code in my way
public class strictlySorting {
    public static void print(int arr[], int i){

       if(i == arr.length-1){
        System.out.println("array is sorted");
        return;
       }
        if(arr[i] < arr[i+1]){
            //array is sorted 
            System.out.println("array is sorted");
        }else{
            // array is not sorted 
            System.out.println("array is not sorted");
        }
        print(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        print(arr, 0);
    }
}
*/
