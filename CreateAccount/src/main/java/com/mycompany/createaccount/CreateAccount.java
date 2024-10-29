/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.createaccount;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class CreateAccount {

   
    //test
    public static void main(String[] args){
        
        Scanner  input = new Scanner(System.in);
        
        System.out.println("Enter firstname");
        String fname = input.nextLine();
         System.out.println("Enter Lastname");
        String lname = input.nextLine();
        
         System.out.println("Enter username");
        String uname = input.nextLine();
         System.out.println("Enter P!ssword@");
        String password = input.nextLine();
        Login user = new Login(Jimm, lname , jimm_1 , p!ssword@);
         System.out.println(user.registerUser());
         
         boolean loginSuccess = user.loginUser("jimm_1" , "P!ssword@");
         boolean loginFailure = user.loginUser("jimm_1" , "wrongpassword");
         
         if(loginSuccess)  {
             System.out.println(user.returnLoginStatus(true));
             part2();
             
         }
         else
             
           System.out.println(user.returnLoginStatus(false));
        
         
       //  System.out.println(user.returnLoginStatus(user.));
         //additional tests
         Login user2 = new 
            Login("Dann" , "Cal" , "Dann_2" , "P@ssw0rd!");
         System.out.println(user2.registerUser());
         Login user3 = new 
            Login("Benny" , "Schnit" , "Ben_ny" , "Password3");
         System.out.println(user3.registerUser());
         boolean loginFailure2 = user.loginUser("jimmy_2","P!ssword@");
         System.out.println(user.returnLoginStatus(loginFailure2));
         Login user4 = new
            Login("Bil" , "Grown" , "Bil_4" , "Strong1!");
         System.out.println(user4.registerUser());
    }
    
   


 class Login {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    
    public Login(String firstNmae , String lastName , String username , String password){
        this.firstName = firstNmae;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }
    public boolean checkUserName(){
        return
                username.contains("_") &&
                username.length() <=5;
    }
    public boolean checkPasswordComplexity(){
        return
                password.length() >=8 &&
                password.matches(".*[A-Z].*") &&//capital letter
                password.matches(".*\\d.*") &&//number
                password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
    }
    public String registerUser(){
        if (!checkUserName()){
         return   "Username is not formatted correctly, please ensure that your username contains an underscore and is no more than 5 characters in length.";
        }
        if(!checkPasswordComplexity()){
            return "Password is not correctly formatted, please ensure that the password contains atleast 8 characters, a capital letter a number and a special character.";
        }
        return "Username and Password successfully captured. Registration complete.";
    }
    public boolean loginUser (String enteredUsername, String enteredPassword){
        return
                this.username.equals(enteredUsername) &&
                this.password.equals(enteredPassword);
    }
    public String returnLoginStatus(boolean loginSuccessful){
        if (loginSuccessful){
            return "Welcome" + firstName +""+ lastName +  ",it is great to see you again.";
        }
        else {
            return "Username or password incorrect, please try again.";
        }
    }
    