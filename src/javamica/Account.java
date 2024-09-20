
package javamica;

import java.util.ArrayList;
import java.util.Scanner;


public class Account {
    
    public static void inputAccount(){
    
        ArrayList<Integer> arr_id = new ArrayList<Integer>();
        ArrayList<String> arr_email = new ArrayList<String>();
        ArrayList<String> arr_user = new ArrayList<String>();
        
        Scanner sc = new Scanner (System.in);
        Accounts[] acc = new Accounts [50];
        
        int num, id;
        String fName, lName, email, user, password;
        
        System.out.print("-------------------------------------");
        System.out.print("\nEnter number of Accounts: ");
        num = sc.nextInt();
        
        for (int i = 0; i < num; i++){
            
            acc[i] = new Accounts();
            System.out.print("-------------------------------------");
            System.out.print("\nEnter detail of Account " + (i+1) + " ");
            
            System.out.printf("\n\tID: ");
            id = sc.nextInt();
            
                while(arr_id.contains(id)){
                    System.out.print("\t\tID already exists, please enter again: ");
                    id = sc.nextInt();
                }
                    arr_id.add(id);
                
            System.out.print("\tFirst Name: ");
            fName = sc.next();
            
            System.out.print("\tLast Name: ");
            lName = sc.next();
            
            System.out.print("\tEmail: ");
            email = sc.next();
            
                while (arr_email.contains(email)){
                    System.out.print("\t\tEmail already exists, please enter again: ");
                    email = sc.next();
                }
                    arr_email.add(email);
            
            System.out.print("\tUsername: ");
            user = sc.next();
            
                while (arr_user.contains(user)){
                    System.out.print("\t\tUsername already exists, please enter again: ");
                    user = sc.next();
                }
                    arr_user.add(user);
            
            do{
                System.out.print("\tPassword: ");
                password = sc.next();
            } while (!isValPass(password));
            
            System.out.print(" ");
            
            acc[i].addAccount(id, fName, lName, email, user, password);
            
        }
        
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.printf(" %-10s  %-10s  %-10s  %-30s  %-10s  %-15s  \n", "ID", "First Name", "Last Name", "Email", "Usernmame", "Password" );
        System.out.println("------------------------------------------------------------------------------------------------------------");
         
        for (int i = 0; i < num; i++){
            acc[i].viewAccount();
        }
    }
    
    public static boolean isValPass (String password){
        
        if (password.length() <= 8){
            System.out.println("\t\tPassword must be 8 characters and above.");
            return false;
        }
        
        if (!password.matches(".*[A-Z]*.")){
            System.out.println("\t\tPassword must contain at least one uppercase letter.");
            return false;
        }
        
        if(!password.matches(".*[a-z]*.")){
            System.out.println("\t\tPassword must contain at least one lowecase letter.");
            return false;
        }
        
        if (!password.matches(".*\\d.*")){
            System.out.println("\t\tPassword must contain at least one digit.");
            return false;
        }
        
        if (!password.matches (".*[!@#$%^&*(),.?\":{}|<>].*")){
            System.out.println("\t\tPassword must contain at least one special character.");
            return false;
        }
        
        String[] comPass = {"admin", "12345", "admin"};
        
        for (String common: comPass){
            if (password.toLowerCase().contains(common)) {
                System.out.println("\t\tPassword must not contain common words like 'admin', 'password', or '1234'.");
                return false;
            }
        }
        
            return true;
        
    }   
    
}
