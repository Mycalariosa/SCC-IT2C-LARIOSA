package javamica;

public class Accounts {
    
   
    int id;
    String fName, lName, email, username, password;
    
    public void addAccount(int aId, String fname, String lname, String em, String user, String pass){
        
        this.id = aId;
        this.fName = fname;
        this.lName = lname;
        this.email = em;
        this.username = user;
        this.password = pass;
        
    }
    
    public void viewAccount(){
        
        System.out.printf(" %-10d  %-10s  %-10s  %-30s  %-10s  %-15s  \n", this.id, this.fName, this.lName, this.email, this.username, this.password );
    }
}

