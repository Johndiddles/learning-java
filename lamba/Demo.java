interface Adder {
    int add(int a, int b);
}
public class Demo {
    public static void main(String args[]) {
        Adder adder = (a, b) -> a + b;
        int sum = adder.add(10, 20);
        System.out.println(sum);
    }
}
