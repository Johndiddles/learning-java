public class Stack {
    int stackSize = 5;
    int stack[] = new int[stackSize];
    int top = 0;
    public void push(int data) {
        if(top == stackSize - 1){
            System.out.println("Stack is full");
            return;
        }
        stack[top] = data;
        top++;
    }
    public int pop() {
        if(isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }
        top--;
        int data;
        data = stack[top];
        stack[top] = 0;
        return data;
    }

    public int peek() {
        int data;
        data = stack[top - 1];
        return data;
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top <= 0;
    }

    public void show() {
        for(int num: stack){
            System.out.print(num + " ");
        }
    }
}