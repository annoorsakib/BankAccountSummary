
package accountproject;


public class MainClass {

    
    public static void main(String[] args) {
        
        Account ac1=new Account("lamia","123.5436578",10000.00);
        ac1.showInfo();
        ac1.deposit(100.00);
        ac1.withdraw(500.00);
        ac1.showInfo();
    }
    
}
