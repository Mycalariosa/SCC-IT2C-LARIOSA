
package javamica;
import java.util.Scanner;

public class Netpay {
        public void getPay(){
        Scanner input = new Scanner (System.in);
        
            String name ;
            int age, Rphr, Thrs,Tdeduc;
            double Tgross,Netpay;
             System.out.println("------------------------------------");
            System.out.print("Enter your Name:");
            name= input.nextLine();
            
            System.out.print("Enter your Age:");
            age =input.nextInt();
            
            System.out.print("Enter rate per hour:");
            Rphr=input.nextInt();
            
            System.out.print("Enter total hours worked:");
            Thrs=input.nextInt();
            
            System.out.print("Enter total deductions:");
            Tdeduc=input.nextInt();
            System.out.println("------------------------------------");
            
            Tgross=Rphr*Thrs;
            Netpay=Tgross-Tdeduc;     
            
            
            System.out.println("------------------------------------");
            System.out.println("-----------SLIP DETAIL--------------");
            System.out.println("------------------------------------");
            
            System.out.println("Date: August 14, 2024");
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            
            System.out.printf("Total gross:%.2f", + Tgross );
            System.out.printf("\nTotal Deduction:"+ Tdeduc);
            
            System.out.printf("\n------------------------------------");
            System.out.printf("\nNet Pay:%.2f",+Netpay);
            System.out.println("\n------------------------------------");       
    
        
}}
