class A 
{
    public A () {
        System.out.println("Inside A default constructor");
    }
    public A(int a){
        System.out.println("in A parameterized constructor");
    }
}

class B extends A {
    public B() {
        super(); // calls the default constructor of A
        System.out.println("in B default constructor");
    }
    public B(int a) {
        this(); // calls the default constructor of B
        // super(a);
        System.out.println("in B parameterized constructor");
    }
}
public class Demo {
    public static void main(String[] args) {
        B b = new B(10);
    }
    
}
