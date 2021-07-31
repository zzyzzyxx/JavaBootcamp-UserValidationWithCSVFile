package com.assignment3;
import java.util.Scanner;

public class UserApplication {
    public static void main(String[] args) {
        Service.readFile();

        //System.out.println();

        int invalidLogins = 0;
        Scanner scan = new Scanner(System.in);
        while (invalidLogins < 5) {
            System.out.println("Enter your email:");
            String email = scan.nextLine();
            System.out.println("Enter your password:");
            String password = scan.nextLine();

            if((email.equalsIgnoreCase(Service.users[0].getEmail())) &&  (password.equals(Service.users[0].getPassword()))){
                System.out.println("Welcome " + Service.users[0].getName());
                break;
            }
            else if((email.equalsIgnoreCase(Service.users[1].getEmail())) &&  (password.equals(Service.users[1].getPassword()))){
                System.out.println("Welcome " + Service.users[1].getName());
                break;
            }
            else if((email.equalsIgnoreCase(Service.users[2].getEmail())) &&  (password.equals(Service.users[2].getPassword()))){
                System.out.println("Welcome " + Service.users[2].getName());
                break;
            }
            else if((email.equalsIgnoreCase(Service.users[3].getEmail())) &&  (password.equals(Service.users[3].getPassword()))){
                System.out.println("Welcome " + Service.users[3].getName());
                break;
            }
            else {
                System.out.println("Invalid login. Please try again");
                invalidLogins++;
            }
            if(invalidLogins == 5) {
                System.out.println("Too many failed login attempts, you are now locked out.");
            }
        }

        scan.close();
    }
}
