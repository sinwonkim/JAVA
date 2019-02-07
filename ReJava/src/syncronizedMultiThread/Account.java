package syncronizedMultiThread;
	
public class Account {
	long balnace;
	
	public synchronized void deposit(long amount) {
		this.balnace += amount;
	}
	
	public void inquiry() {
		System.out.println("ภÜพื" + balnace);
	}
	
}
