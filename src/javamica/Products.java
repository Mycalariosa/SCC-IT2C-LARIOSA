
package javamica;

public class Products {
    int id, sold, stock=0;
       String name, status;
       double price, profit, tep;
       
       public void addProduct(int pid, String pname, int psold, int pstock, double pprice){
            
           this.id = pid;
           this.name = pname;
           this.sold = psold;
           this.stock = pstock;
           this.price = pprice;
           
           this.profit = this.price * this.sold;
           this.tep = this.price * this.stock;
           
           this.status = (this.stock < 1) ? "Out-of-Stock" : "Available"; 
       }
       
       public void viewProduct(){
                 
           System.out.printf("%-10d %-15s %-10.2f %-10d %-10d %-10.2f %-15s %-10.2f\n",
            this.id, this.name, this.price, this.sold, this.stock, this.profit, this.status, this.tep);
       }
}

