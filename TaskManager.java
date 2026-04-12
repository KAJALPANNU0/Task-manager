import java.util.ArrayList;

public class TaskManager {
    // four things 
    // add the task ,, delete teh task,, taks is completed or not ,, show all the tasks 

    private ArrayList<Task> tasks;

    public TaskManager (){
        tasks = new ArrayList<Task>();  
      }

    // adding the task !
    public void addTask(String title ){
        Task newTask = new Task(title);
        tasks.add(newTask);
    }

    //delete the task 

    public void deleteTask(int id ){
        for(int i =0;i<tasks.size();i++){
            Task currentTask = tasks.get(i);
            if(currentTask.getId()== id){
                tasks.remove(i);
                break;
            }
        }
    }
}
