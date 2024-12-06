public class Stack<T> {
    private Node<T>top;

    public Stack() {
        this.top = null;
    }
    public void push(T value){
        if(top==null)
            top=new Node<>(value);
        else
            top=new Node<>(value,top);
    }
    public T pop(){
        if(!isEmpty()) {
            T temp = stackTop();
            top=top.getNext();
            return temp;
        }
        return null;
    }
    public boolean isEmpty(){
        return top==null;
    }
    public T stackTop(){
        if(!isEmpty())
            return top.getValue();
        return null;
    }
    public String toString(){
        String str="";
        Stack<T>s1=new Stack<>();
        while (!isEmpty()){
            str+=stackTop()+" < ";
            s1.push(pop());
        }
        while (!s1.isEmpty())
            push(s1.pop());
        return str;
    }
    //num of element
    public int stackLen(){
        int cnt=0;
        Stack<T>s1=new Stack<>();
        while (!isEmpty()){
            s1.push(pop());
            cnt++;
        }
        while (!s1.isEmpty())
            push(s1.pop());
        return cnt;
    }
}
