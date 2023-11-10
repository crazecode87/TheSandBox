import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws IOException {

greeting();
tasks();

    }



    public static void greeting(){

        //Greetings
        System.out.println("Welcome to Smart List!");

    }
    public static void tasks() throws IOException {

        //Create a file to save tasks for future use
        try {
            File myObj = new File("Tasks.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        Scanner createTasks = new Scanner(System.in);
        System.out.println("What is your first tasks for today? :");
        String task = createTasks.nextLine();
        System.out.println("Awesome today's task is :" + task);

        try {
            FileWriter save = new FileWriter("task.txt");
            save.write(task);
            save.close();
        } catch (IOException e) {
            System.out.println("Error occurred when saving taskss");
            e.printStackTrace();

        }


    }
}