package syncronizedMultiThread;

public class DepositThread implements Runnable{

	Account myAccount;
	
	
	
	public DepositThread(Account thisAccount) {
		this.myAccount = thisAccount;
	}



	@Override
	public void run() {
		synchronized(myAccount) {
		for(int i = 0; i<1000; i++) {
			myAccount.deposit(1);
			
		}
		myAccount.inquiry();
	}
  }
}
