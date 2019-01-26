package Animal;

public class Lion extends Animal  implements Predator,Barkable {

	@Override // Predator에서 만든  getFood라는 메소드를 구현해야함 
	public String getFood() {
		
		return "banana";
	}

	@Override
	public void bark() {
		System.out.println("으르렁 호랑이");
		
	}


}
