
public class BalanceException extends Exception {

	BalanceException() {System.out.println("BalanceException Class has been cereated");} //constructor 
	public BalanceException(String message){
		super(message);
	}
}
