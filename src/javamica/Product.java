
package javamica;

import java.util.Scanner;


public class Product {
    public static void inputProduct(){
        
        Products[] prod = new Products[100];
        Scanner sc = new Scanner(System.in);
        
        int num;
        double profit = 0, tep = 0;
        System.out.println("------------------------------------");
        System.out.print("Enter no. of Products: ");
        num = sc.nextInt();
        
        
        for (int i = 0; i < num; i++ ){
            System.out.println("------------------------------------");
            System.out.print("Enter details for product " + (i+1) + " ");
            
            System.out.print("\n");
            System.out.print("Enter Product ID: ");
            int id = sc.nextInt();
            
            System.out.print("Enter Product Name: ");
            String name = sc.next();
            
            System.out.print("Enter Product Price: ");
            double price = sc.nextDouble();
            
            System.out.print("Enter Product Sold: ");
            int sold = sc.nextInt();
            
            System.out.print("Enter Product Stock: ");
            int stock = sc.nextInt();
            
            prod[i] = new Products();
            prod[i].addProduct(id, name, sold, stock, price);
            
            profit += (price*sold);
            tep += (price*stock);
            
            
        }
        
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-10s %-10s %-10s %-10s %-15s %-10s\n",
                            "ID", "NAME", "PRICE", "SOLD", "STOCK", "PROFIT", "STATUS", "Total Expense Profit");
        System.out.println("------------------------------------------------------------------------------------------------------------");
        
        for (int i=0; i<num; i++){
            prod[i].viewProduct();
        }
        
    }
}

