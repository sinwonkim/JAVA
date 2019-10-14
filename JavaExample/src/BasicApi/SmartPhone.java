package BasicApi;

public class SmartPhone {
	private String company;
	private String os;
	private String test;
	
	public SmartPhone(String co,String o) {
		this.company = co;
		this.os = o;
	}
	
	@Override
	public String toString() {
		return company +", " + os;
		
	}
}
