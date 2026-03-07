public class setBitExample {
    public static void main(String[] args) {
        int n = 5; // 0101
        int pos = 1;
        int bitmask = 1<<pos;

        int number = bitmask | n;
        System.out.println(number);  // IMP : position of 1 after buitmask = final operation and rest of values will changed
    }
}
