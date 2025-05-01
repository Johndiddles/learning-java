// wants us to declare package name here......but we are not using any package as this stand alone.

@FunctionalInterface
interface Adder {
    int add(int a, int b);
}
public class Demo {
    public static void main(String args[]) {
        
        Adder adder = new Adder()
        {
            public int add(int a, int b) {
                return a + b;
            }
        };
    
        int sum = adder.add(10, 20);
        System.out.println(sum);
    }
};
