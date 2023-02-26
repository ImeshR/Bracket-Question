class StackX {
    private int maxsize;
    private int top;
    private char[] stackArr;

    public StackX(int size) {
        top = -1;
        maxsize = size;
        stackArr = new char[maxsize];
        
    }

    public void push(char ch){
        if(isFull()){
            System.out.println("Stack is Full");
            return;
        }
        else{
            stackArr[++top] = ch;
        }
    }   

    public char pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return '\0';
        }
        else{
            return stackArr[top--];
        }
    }

    public char peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return '\0';
        }
        return stackArr[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == (maxsize - 1));
    }

}