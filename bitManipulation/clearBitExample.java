public class clearBitExample {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitmask = 1<<pos;

        int negation = ~(bitmask);

        int result = negation & n ;
        System.out.println(result);
        }
}
