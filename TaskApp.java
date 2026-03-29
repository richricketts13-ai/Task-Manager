import java.util.Scanner;

public class TaskApp {

    public static void main(String[] args) {

        runMenu();

    }






    public static void runMenu() {

    TaskManager taskManager = new TaskManager();

    Scanner input = new Scanner(System.in);

    int choice;

    while (true) {
        System.out.println("\nTask Manager Menu:");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Mark Task as Complete");
        System.out.println("4. Remove Task");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        
        choice = input.nextInt();

        input.nextLine(); 

        switch (choice) {
            case 1 -> {
                System.out.println("Enter task title: ");

                String title = input.nextLine();

                System.out.println("Enter task description: ");

                String description = input.nextLine();

                Task newTask = new Task(title, description);

                taskManager.addTask(newTask);

                }
            case 2 -> {

                taskManager.viewTasks();

                
            }
            case 3 -> {
                System.out.println("Enter task number:");

                int index = input.nextInt();

                input.nextLine();


                taskManager.markComplete(index);

               
            }
            case 4 -> {
                System.out.println("Enter task number:");

                int index = input.nextInt();

                input.nextLine();

                taskManager.removeTask(index);

               
            }
            case 5 -> {

                System.out.println("Exiting Task Manager. Goodbye!");
                return;
            }
            default -> System.out.println("Invalid choice. Please try again.");
         }
        }
    }
}

