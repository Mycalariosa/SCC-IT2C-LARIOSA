package javamica;

import java.util.Scanner;

public class Salary {
    public void inputSalary() {
        Scanner sc = new Scanner(System.in);
        Salaries[] sl = new Salaries[100];

        System.out.println("------------------------------------");
        System.out.print("Enter the number of Employees: ");
        int nums = sc.nextInt();
        double totalSalaryRequest = 0, totalDeductions = 0;

        for (int i = 0; i < nums; i++) {
            sl[i] = new Salaries();
            System.out.println("------------------------------------");
            System.out.println("Details of employee " + (i + 1) + ":");

            System.out.print("ID: ");
            int sid = sc.nextInt();

            System.out.print("Name: ");
            sc.nextLine();  
            String name = sc.nextLine();

            System.out.print("Rate per hour: ");
            double rate = sc.nextDouble();

            System.out.print("Hours worked: ");
            int hours = sc.nextInt();

            System.out.print("Total deductions: ");
            double deductions = sc.nextDouble();
            
            double grossPay = rate * hours;
            double netPay = grossPay - deductions;
            totalSalaryRequest += grossPay;
            totalDeductions += deductions;

            sl[i] = new Salaries();
            sl[i].addSalary(sid, sid, hours, netPay, name);
        }

        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-10s %-10s %-10s %-10s %-10s\n",
                            "ID", "NAME", "RATE", "HOURS", "GROSS", "DEDUCTION", "NETPAY");
        System.out.println("--------------------------------------------------------------------------------");

        for (int i = 0; i < nums; i++) {
            sl[i].viewSalary(); 
        }
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("Total Salary Request: %.2f\n", totalSalaryRequest);
        System.out.printf("Total Deductions: %.2f\n", totalDeductions);
        System.out.printf("Total Salary to Release: %.2f\n", (totalSalaryRequest - totalDeductions));
    }
}
