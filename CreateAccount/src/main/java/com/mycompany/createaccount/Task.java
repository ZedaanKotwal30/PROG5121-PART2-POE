/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.createaccount;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class Task {
    private String taskName;
    private String taskDescription;
    private String developerDetails;
    private int taskDuration;
    private String taskID;
    private String taskStatus;
    private int taskNumber;
    
    
    
    
    public Task(String taskName, String taskDescription, String developerDetails,int taskDuration ){
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.developerDetails = developerDetails;
        this.taskDuration = taskDuration;
        this.taskStatus = "To do";
        this.taskID = createTaskID();
    }
    
   public boolean chechTaskDescription(){
       return taskDescription.length() <= 50;
   }
   private String createTaskID(){
   if (taskName.length() <2 ||
           developerDetails.length() <3 ){
       return"";
   }
   String firstTwo = taskName.substring(0, 2).toUpperCase();
   String lastThree = developerDetails.substring(developerDetails.length() -3).toUpperCase();
        String taskNumber = null;
   return firstTwo + ":" + taskNumber + ":" + lastThree;
   }
   public String printTaskDetails(){
       return String.format(
               "Task Status: %s%n"+
               "Developer Details: %s%n"+
               "Task Number: %d%n"+
               "Task Name: %s"+
               "Task Description: %s%n"+
               "Task ID: %s%n"+
               "Duration: %d hours",
               taskStatus, developerDetails, taskNumber, taskName,taskDescription, taskID, taskDuration);
   
   }
   
//setters
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getTaskID() {
        return taskID;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public void setTaskDuration(int taskDuration) {
        this.taskDuration = taskDuration;
    }

    public String getDeveloperDetails() {
        return developerDetails;
    }

    public void setDeveloperDetails(String developerDetails) {
        this.developerDetails = developerDetails;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
    
    public String getTaskName() {
        return taskName;
    }
    public void setTaskNumber(int number){
        this.taskNumber = number;
    }
    public void setTakStatus (String status){
        this.taskStatus = status;
    }
    public int getTaskDuration(){
    return taskDuration;
    }
}

 class TaskManager{

    private static boolean loginSuccess;
    private ArrayList<Task> tasks;
    private int totalTasks;
    private Login currentUser;
    
    public TaskManager (Login user){
        this.tasks = new ArrayList<>();
        this.totalTasks = 0;
        this.currentUser = user;
    }

    public String addTask(String taskName, String taskDescription, String developerDetails, int taskDuration){
        task task = new task(taskName, taskDescription, developerDetails, taskDuration);
        if (!task.chechTaskDescription()){
            return
                    "Please enter a atsk description of less than 50 characters";
        }
        task.setTaskNumber(totalTasks++);
        tasks.add(task);
        return "task successfully captured";
    }
    public int returnTotalHours(){
        return 
                task.stream().mapToInt(::getTaskDuration).sum();
    }
 
    public void displayMenu(){
        System.out.println("Welcome to EasyKanban");
        System.out.println("1. Add task ");
        System.out.println("2. Show report (Coming Soon)");
        System.out.println("3. Quit");
    }
     public static void part2(){
        JOptionPane.showMessageDialog(null, "Welcome come to easy kanban");
        
        while(true){
                int num  = Integer.parseInt(JOptionPane.showInputDialog(".1 Add task \n 2. Show Report(Coming soon) \n 3.Quit"));

       }
        if(loginSuccess) {
            System.out.println(user.returnLoginStatus(true));
            part2();
        } else System.out.println(user.returnLoginStatus(false));
     }
    public void run (){
        Scanner scanner = new Scanner( System.in);
        boolean running = true;
        
        while (running){
            displayMenu();
            System.out.println("Choose an option:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 1:
                    System.out.print("How many tasks to add?");
                    int numTasks = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < numTasks; i++){
                        System.out.println("\nEnter details for task" + (i + 1));
                        System.out.print("Taks name:");
                        String name = scanner.nextLine();
                        System.out.print("Task description:");
                        String description = scanner.nextLine();
                        System.out.print("Developer Details(First and Last Name");
                        String developer = scanner.nextLine();
                        System.out.print("Task duration(hours)");
                        int duration = scanner.nextInt();
                        scanner.nextLine();
                        String result = addTask(name, description, developer, duration);
                        System.out.println(result);
                        if
                                (result.equals("Task successfully captured")){
                            System.out.println("Select task status:");
                            System.out.println("1. To Do");
                            System.out.println("2. Doing");
                            System.out.println("3. Done");
                            int status = scanner.nextInt();
                            scanner.nextLine();
                              String statusText;
                            switch{case 1:
                                statusText="To Do";
                                break;
                                case 2:
                                    statusText="Doing";
                                case 3:
                                    statusText="Done";
                                default:
                                    statusText="To Do";
                                }
                                tasks.get(tasks.size 1).setTaskStatus(statusText);
                    }
            }
                            
                       System.out.println("Total hours for all tasks: "+ returnTotalHours());
                       break;
                      case 2:
                      System.out.println("Coming soon");
                      break;
                      
                      case 3:
                      running = false;
                      break;
                      default:
                      System.out.println("Invalid option");
        }
    }
    scanner.close();
 }
            

    private String createTaskID() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void sum() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setTaskStatus(String statusText) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class Login {

        public Login() {
        }
    }
}

//tests
 public static class TaskTest{
    @Test
    public void testCheckTaskDescription(){
        Task task = new Task ("Login Feature", "Create Login to authenticate users", "Jacki Jackson", 8);
        
        assertFalse(longDescTask.checkDescription());
    }
}


