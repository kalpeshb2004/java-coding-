package mypack;

public class TestPackage {

    // method inside same package
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        TestPackage obj = new TestPackage();
        int result = obj.add(10, 20);

        System.out.println("Sum: " + result);
    }
}