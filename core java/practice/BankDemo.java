package practice;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         BankAccount savings=new SavingsAccount();
         BankAccount checking = new CheckingAccount();
         
         System.out.println("---------Handling saving account---------");
         
         savings.deposite(500.00);
        double savingRate=savings.calculateInterest();
         
        System.out.println("savings interest rate"+(savingRate*100)+"%");
        
        System.out.println("---------Handling checking account--------");
        
        checking.deposite(200.00);
        double checkingRate=checking.calculateInterest();
        
        System.out.println("savings interest rate"+(checkingRate*100)+"%");
	}

}
