package javamica;

import java.util.Scanner;

public class Grade {

    public void editGrades(Grades[] grs, int size, int id) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            if (grs[i].id == id) {
                System.out.print("New Prelim Grade: ");
                double pre = sc.nextDouble();
                grs[i].p = pre;

                System.out.print("New Midterm Grade: ");
                double mid = sc.nextDouble();
                grs[i].m = mid;

                System.out.print("New Pre-final Grade: ");
                double prefi = sc.nextDouble();
                grs[i].pf = prefi;

                System.out.print("New Final Grade: ");
                double fin = sc.nextDouble();
                grs[i].f = fin;

                System.out.println("Grades updated successfully.");
                return;
            }
        }
        System.out.println("Student ID not found.");
    }

    public void genGrade() {
        Scanner sc = new Scanner(System.in);
        Grades[] gr = new Grades[100];

        String op;
        int nums = 0;
        
        do {
            System.out.println("\n|-------------------------------------|");
            System.out.println("|      Welcome to the Grading App!    |");
            System.out.println("|-------------------------------------|");
            System.out.println("| 1. ADD                              |");
            System.out.println("| 2. VIEW                             |");
            System.out.println("| 3. UPDATE                           |");
            System.out.println("| 4. DELETE                           |");
            System.out.println("| 5. EXIT                             |");
            System.out.println("|-------------------------------------|");

            System.out.print("Enter choice (1-5): ");
                int option = sc.nextInt();

            while (option < 1 || option > 5) {
                System.out.print("Invalid choice, try again: ");
                option = sc.nextInt();
            }

            switch (option) {
                case 1:
                    System.out.print("-------------------------------------");
                    System.out.print("\nEnter number of students: ");
                    int numgrades = sc.nextInt();

                    for (int i = 0; i < numgrades; i++) {
                        System.out.println("Student " + (i + 1) + ":");
                        System.out.print("ID: ");
                        int id = sc.nextInt();

                        System.out.print("Name: ");
                        String name = sc.next();

                        System.out.print("Prelim: ");
                        double p = sc.nextDouble();

                        System.out.print("Midterm: ");
                        double m = sc.nextDouble();

                        System.out.print("Prefinal: ");
                        double pf = sc.nextDouble();

                        System.out.print("Final: ");
                        double f = sc.nextDouble();

                        gr[nums] = new Grades();
                        gr[nums].addGrades(id, name, p, m, pf, f);
                        nums++;
                    }
                    System.out.println("Students added successfully!");
                    break;

                case 2:
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                  "ID", "NAME", "PRELIM", "MIDTERM", "PREFINAL", "FINALS", "AVERAGE", "REMARKS");
                    System.out.println("--------------------------------------------------------------------------------");
                    for (int i = 0; i < nums; i++) {
                        gr[i].viewGrades();
                    }

                    break;

                case 3:
                    System.out.print("Enter ID to Update: ");
                    int ids = sc.nextInt();
                    editGrades(gr, nums, ids);
                    break;

                case 4:
                    System.out.println("Sorry delete option is not yet done!.");
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;
            }

            System.out.print("\nDo you want to continue? (Y/N): ");
            op = sc.next();
        } while (op.equalsIgnoreCase("Y"));
    }
}


