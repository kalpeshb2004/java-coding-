public class innerClass {
    int x = 10;
    String str = "kalpesh"; // static field
       class inner {
          void show(){
            System.out.println(x);
            System.out.println(str);
          }
       }

       public static void main(String[] args) {
           innerClass obj = new innerClass();
           innerClass.inner in = obj.new inner();

           in.show();
       }
}

