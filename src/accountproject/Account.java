
package accountproject;

public class Account {
    private String accName="";
    private String acid="";
    private double balance=0.0;
    
    public Account()
    {
        
    }
    
    public Account(String name,String acno,double v)
    {
        this.accName=name;
        this.acid=acno;
        this.balance=v;
    }
    
    public void deposit(double amount)
    {
        this.balance+=amount;
    }
    public void withdraw(double amount)
    {
        this.balance-=amount;
    }
    
    public void showInfo()
    {
        System.out.println("account details: ");
        System.out.println("Account no: "+this.acid);
        System.out.println("A/C name: "+ this.accName);
        System.out.println("balance: "+this.balance);
    }
}
