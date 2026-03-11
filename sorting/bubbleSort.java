public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = {6,4,8,3,5,1};

        //bubble sort
        for (int i = 0; i <arr.length-1; i++) { // iteraration = n-1.
            for (int j = 0; j < arr.length-i-1; j++) { // iteraration = n-1. but last bigger value wont be repeat thats why -i taken. 
                //swapping of numbers greater number last and lower number first
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
         for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();

    }
}