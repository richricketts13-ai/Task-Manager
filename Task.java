public class Task {
    //Class  variables
    private String title;

    private String description;
    
    private boolean isCompleted;

    //Constructor
    public Task(String title, String description) {
        this.title = title;

        this.description = description;
        
        this.isCompleted = false; //Default value 
    }

    //Getter Methods
    public String getTitle() {

        return title;

    }

    public String getDescription() {

        return description;

    }

//Methods to check if task is completed and to mark it as complete
    public boolean isCompleted() {
        
        return isCompleted;
    }

    public void markComplete() {

        this.isCompleted = true;

    }
// Display Method

    public String displayTask(){
        if(isCompleted()) {
            return "[X] " + title + ": " + description;
        } else {
            return "[ ] " + title + ": " + description;
        }
        }
    }






