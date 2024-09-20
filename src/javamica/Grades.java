
package javamica;

public class Grades {
    int id;
   String name;
   double p,m, pf, f;
   
   
   public void addGrades (int studentid, String name, double pre, double mid, double prefi,double fin){
       this.name = name;
       this.id=studentid;
       this.p=pre;
       this.m=mid;
       this.pf=prefi;
       this.f=fin;
       
       
   }
   
   public void viewGrades (){
       double average = (this.p +this.m +this.pf +this.f)/4;
       String remark = (average > 3.0) ? "Failled": "Passed";
       
       
       System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10s \n",
                           this.id, this.name, this.p, this.m, this.pf,this.f,average, remark);
      
   }
   
   
}

