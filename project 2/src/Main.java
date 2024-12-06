public class Main {
    public static void main(String[] args) {
        TaskManagement management = new TaskManagement();

        management.AddTask(new Task("fixing", 2));
        management.AddTask(new Task("baking", 2));
        management.AddTask(new Task("washing", 1));
        management.AddTask(new Task("eating", 3));
        management.AddTask(new Task("drinking", 1));
        management.AddTask(new Task("looking", 3));
        management.AddTask(new Task("running", 3));
        management.AddTask(new Task("swimming", 2));
        management.AddTask(new Task("drawing", 1));

        System.out.println(management.toString());


    }
}