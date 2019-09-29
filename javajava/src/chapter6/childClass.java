package chapter6;

public class childClass extends AbrstarctClass {

	public childClass(String owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}
	

	public static void main(String[] args) {
		childClass childClass= new childClass("부모");
		
		 childClass.turnOn();
	}


	@Override
	String abstartMethodEx() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
