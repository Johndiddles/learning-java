public class DynamicStack {
    int stackSize = 5;
    int stack[] = new int[stackSize];
    int top = 0;
    public void push(int data) {

        if(size() == stackSize){
           expand();
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
        shrink();
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

    public void expand() {
        stackSize *= 2;
        int temp[] = new int[stackSize];
        System.arraycopy(stack, 0, temp, 0, size());
        stack = temp;
    }

    public void shrink() {
        int length = size();
        if(length <= (stackSize / 2)){
            stackSize /= 2;
            int temp[] = new int[stackSize];
            System.arraycopy(stack, 0, temp, 0, length);
            stack = temp;
        }
    }

    public void show() {
        for(int num: stack){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}