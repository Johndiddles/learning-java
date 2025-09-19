public class Runner {
    public static void main(String[] args){
        DynamicStack stack = new DynamicStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(35);
        stack.show();
        stack.push(74);
        stack.push(206);
        stack.push(843);
        stack.show();
        System.out.println();
        System.out.println(stack.peek());
        System.out.println("Size: " + stack.size());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.show();
    }
}
