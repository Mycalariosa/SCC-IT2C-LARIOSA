
package javamica;

public class Salaries {

    int id;
    String name;
    int rate, hours;
    double deduction;

    public void addSalary(int sid, int srate, int shours, double sdeduc, String sname) {
        this.id = sid;
        this.name = sname;
        this.rate = srate;
        this.hours = shours;
        this.deduction = sdeduc;
    }

    public void viewSalary() {
        double gross = (double) rate * hours;
        double netPay = gross - deduction;

        System.out.printf("%-10d %-15s %-10d %-10d %-10.2f %-10.2f %-10.2f\n",
                this.id, this.name, this.rate, this.hours, gross, this.deduction, netPay);
    }
}
