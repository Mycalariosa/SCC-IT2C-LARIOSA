
package javamica;

import java.util.Scanner;

public class Javamica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch;

        do {
            System.out.println("\n|------------------|");
            System.out.println("|        MENU      |");
            System.out.println("|------------------|");
            System.out.println("| 1. Grade         |");
            System.out.println("| 2. Net Pay       |");
            System.out.println("| 3. Salaries      |");
            System.out.println("| 4. Products      |");
            System.out.println("| 5. Accounts      |");
            System.out.println("|------------------|");
            
            System.out.print("Choose from 1-5: ");
            int action = sc.nextInt();

            while (action < 1 || action > 5) {
                System.out.print("\tInvalid action. Please enter a number between 1 and 5: ");
                action = sc.nextInt();
            }

            switch (action) {
                case 1:
                    Grade gr = new Grade();
                    gr.genGrade();
                    break;
                case 2:
                    Netpay np = new Netpay();
                    np.getPay();
                    break;
                case 3:
                    Salary sal = new Salary();
                    sal.inputSalary();
                    break;
                case 4:
                    Product pr = new Product();
                    Product.inputProduct();
                    break;
                case 5:
                    Account ac = new Account();
                    Account.inputAccount();
                    break;
            }

            System.out.print("\nDo you want to use another system? (Y/N): ");
            ch = sc.next();
        } while (ch.equalsIgnoreCase("Y"));

        System.out.println("\nThank you for using JavaRode!");
    }
}
