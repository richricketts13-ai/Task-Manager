import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks;

    //Constuctor
    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    //Methods
    public void addTask(Task task) {

        this.tasks.add(task);

        System.out.println("Task added successfully.");
    }



    public void removeTask(int index) {
        
        if (this.tasks.isEmpty()) {

            System.out.println("No tasks to remove.");

        } else if (index < 1 || index > this.tasks.size()){

            System.out.println("Invalid task number. Please try again.");
        }
        else {
            this.tasks.remove(index - 1); // Adjusting for 0-based index

            System.out.println("Task removed successfully.");
        }
            
    }

    

    public void viewTasks() {

        if (this.tasks.isEmpty()) {

            System.out.println("No tasks to display.");

        } 

            for (int i = 0; i < this.tasks.size(); i++) {

            System.out.println((i + 1) + ". " + this.tasks.get(i).displayTask());
        }      
}




    public void markComplete(int index) {

        if (this.tasks.isEmpty()) {

            System.out.println("No tasks to mark as complete.");

        } else if (index < 1 || index > this.tasks.size()){

            System.out.println("Invalid task number. Please try again.");
        }
        else {
            this.tasks.get(index - 1).markComplete(); // Adjusting for 0-based index
            
            System.out.println("Task marked as complete.");

        }
     }
}