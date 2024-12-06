public class Main {
    public static boolean IsExist(Stack<Integer>s, int num){
        Stack<Integer>temp = new Stack<>();
        boolean exist = false;
        while (!s.isEmpty()&&!exist){
            temp.push(s.pop());
            if (temp.stackTop() % 10 == num)
                exist = true;
        }
        while (!temp.isEmpty()){
            s.push(temp.pop());
        }
        return exist;
    }

    public static boolean AllExist(Stack<Integer>s){
        Stack<Integer>temp = new Stack<>();
        Stack<Integer>s2 = new Stack<>();
        Stack<Integer>s3 = new Stack<>();
        while (!s.isEmpty()){
            s3.push(s.pop());
            s2.push(s3.stackTop());
        }
        while (!s3.isEmpty()){
            s.push(s3.pop());
        }
        while (!s.isEmpty()){
            temp.push(s.pop());
            int x = temp.stackTop();
            while (x>10){
                x = x / 10;
            }
            if (!IsExist(s2, x))
                return false;

        }
        while (!temp.isEmpty()){
            s.push(temp.pop());
        }
        return true;
    }

    public static void main(String[] args) {

        int [] arr={36,53,65,87,11,28, 52};///true
        Stack<Integer>s=new Stack<>();
        for (int i = 0; i < arr.length ; i++) {
            s.push(arr[i]);
        }

        System.out.println(AllExist(s));

        int [] arr2={36,53,65,87,11,21, 52};///false
        Stack<Integer>s2=new Stack<>();
        for (int i = 0; i < arr2.length ; i++) {
            s2.push(arr2[i]);
        }

        System.out.println(AllExist(s2));

        //C:\Users\sari1\.jdks\openjdk-23\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.2.4\lib\idea_rt.jar=58064:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.2.4\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\sari1\שולחן העבודה\פרויקטים\מבנה נתונים\פרוייקטי סיכום במחסנית\project 1\out\production\project 1" Main
        //true
        //false
        //
        //Process finished with exit code 0

    }
}