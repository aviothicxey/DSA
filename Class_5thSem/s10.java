package Class_5thSem;
class s10{
// implementation of stack using array:
    static int size;
    static int top;
    static int arr[];
    s10(int size){
        this.size = size;
        arr = new int[size];
        top = -1;
    }
    static void push(int data){
        if(top == size - 1){
            System.out.println("Stack is full");
        } else {
            top++;
            arr[top] = data;
        }
    }
    static int pop(){
        if(top < 0){
            System.out.println("Stack is empty");
            return -1;
        } else {
            int data = arr[top];
            top--;
            return data;
        }
    }
    static int peek(){
        if(top < 0){
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[top];
        }
    }
    static int size(){
        return top + 1;
    }
    static boolean isEmpty(){
        return top == -1;
    }


    public static void main(String[] args) {
        s10 stack = new s10(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is: " + stack.size());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is: " + stack.size());
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}