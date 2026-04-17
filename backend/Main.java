import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        TaskManager tm = new TaskManager();
        tm.addTask("i want to learn this prject");
        tm.addTask("i am gettting an inter");
        tm.addTask("i am building projects an d occupied with my self growth tasks");
        tm.deleteTask(2);
        tm.toggleComplete(3);
        ArrayList<Task> allTasks = tm.getAllTasks();
            for(Task task : allTasks) {
             System.out.println(task.getId() + " " + task.getTitle() + " " + task.isCompleted());
        }

    }
}
    