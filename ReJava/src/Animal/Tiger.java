package Animal;

public class Tiger extends Animal implements Predator,Barkable {

	@Override
	public String getFood() {
		
		return "apple";
	}

	@Override
	public void bark() {
		System.out.println("¾îÈï »çÀÚ");
		
	}
	
}
