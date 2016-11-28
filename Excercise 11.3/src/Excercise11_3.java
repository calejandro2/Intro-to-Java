import ToolKit.Account;
import ToolKit.CheckingAccount;
import ToolKit.SavingsAccount;

public class Excercise11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Account account = new Account(111, 200);
	        CheckingAccount checkingAccount = new CheckingAccount(112, 250);
	        SavingsAccount savingsAccount = new SavingsAccount(113, 300);

	        System.out.println(account);
	        System.out.println(checkingAccount);
	        System.out.println(savingsAccount);
	}

}
