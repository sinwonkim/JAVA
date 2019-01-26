package Animal;

public class Lion  implements Predator {

	@Override // Predator에서 만든  getFood라는 메소드를 구현해야함 
	public String getFood() {
		
		return "banana";
	}


}
