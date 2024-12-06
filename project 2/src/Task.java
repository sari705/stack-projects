public class Task {
    private String content;
    private int code;

    public Task(String content, int code){
        this.content = content;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Task{" +
                "content='" + content + '\'' +
                ", code=" + code +
                '}';
    }

    public int getCode() {
        return code;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
