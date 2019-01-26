package Animal;

public class Zookeeper {
	/*public void feed(Tiger tiger) { // 메소드 오버로딩
		System.out.println("feed apple");
	}
	
	public void feed(Lion lion) { // 메소드 오버로딩
		System.out.println("feed banana");
	}*/
	
	public void feed(Predator predator) { // Predator 인터페이스를 파라미터로 
		System.out.println("feed "+predator.getFood());
	}

	
	public static void main(String[] args) {
		Zookeeper zookeeper = new Zookeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		
		zookeeper.feed(tiger); // feed메소드 호출후 argument로 던져도 받을 수 있음 
		zookeeper.feed(lion);
	}
}
