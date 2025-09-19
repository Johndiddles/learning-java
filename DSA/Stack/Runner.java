public class Runner {
    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.show();
        System.out.println();
        System.out.println(stack.peek());
        System.out.println("Size: " + stack.size());
        stack.pop();
        stack.show();
    }
}
