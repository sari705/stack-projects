public class TaskManagement {

    private Stack<Task>s;

    public TaskManagement() {
        this.s = new Stack<>();
    }

    public void AddTask(Task t){
        int x = t.getCode();
        Stack<Task>temp = new Stack<>();
        while (s.stackTop().getCode()>x||!s.isEmpty()){
            temp.push(s.pop());
        }
        s.push(t);
        while (!temp.isEmpty()){
            s.push(temp.pop());
        }
    }

    public Task RemoveTask(){
        if (!s.isEmpty())
            return s.pop();
        else return null;
    }


    @Override
    public String toString() {
        String str = "";
        Stack<Task>temp = new Stack<>();
        while (!s.isEmpty()){
            temp.push(s.pop());
            str += "content: "+temp.stackTop().getContent() + " ,code: "+ temp.stackTop().getCode() +" > \n";
        }
        while (!temp.isEmpty()){
            s.push(temp.pop());
        }
        return str;
    }
}
