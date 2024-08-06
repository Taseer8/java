public class BankTest{
	public static void main (String[] args){
		Bank.bankName = "SBI";
		Bank.acoountHoldername = "MDtaseer";
		Bank.debitcardavailable = true;
		Bank.balance=50000f;
		Bank.accountNumber = 123456789l;
		Bank.ifscCode = "SBI001";
		
		float currentBalance = Bank.withdrawAmount(3000); 
		System.out.println("currentBalance is :"+currentBalance);
		
		boolean card = Bank.debitCard();
		
		Bank.cibil(730);
		Bank.details();
		Bank.match();
		
		
	}
}