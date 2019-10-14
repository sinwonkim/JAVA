import javax.swing.text.BadLocationException;

public class Account {
	public static void main(String[] args) throws BadLocationException{
		Account account = new Account();
		account.withdraw(1000);
	}
	private long balance; //field
	
	public Account() {} //constructor
	
	public long getBlance() { // return filed of balance method
		return balance;
	}
	
	public void deposit(int money) { // deposit money method
		balance += money; 
	}
	
	public void withdraw(int money) throws BadLocationException {
		if(balance < money ){
			try {
				throw new BalanceException();
			} catch (BalanceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		balance -= money;
	}
	
}
