
import java.util.Scanner;
class calculator {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a two numbers");
        int a = x.nextInt();
        int b = x.nextInt();

        System.out.println("enter operators");
        char op = x.next().charAt(0); //.charAt(0) bec of 'operator'

        switch (op) {
            case '+' : System.out.println("addition is " + (a + b));
            break;

            case '-' : System.out.println("substraction is " + (a - b));
            break;

            case '*' : System.out.println("substraction is " + (a * b));
            break;

            case '/' : System.out.println("division is " + (a / b));
            break;

            default: System.err.println("Invalid case");
                
        }
        




    }
} 