public class Task{
    private static int counter = 0;
    private int id;
    private String title;
    private boolean isCompleted;


    public Task(String title){
        counter++;
        this.id = counter;
        this.title = title;
        this.isCompleted = false;
    }

    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public boolean isCompleted(){
        return isCompleted;
    }
    public void toggleComplete(){
        isCompleted = !isCompleted;
    }
}