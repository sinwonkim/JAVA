package Animal;

public class Zookeeper {
	/*public void feed(Tiger tiger) { // �޼ҵ� �����ε�
		System.out.println("feed apple");
	}
	
	public void feed(Lion lion) { // �޼ҵ� �����ε�
		System.out.println("feed banana");
	}*/
	
	public void feed(Predator predator) { // Predator �������̽��� �Ķ���ͷ� 
		System.out.println("feed "+predator.getFood());
	}

	
	public static void main(String[] args) {
		Zookeeper zookeeper = new Zookeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		
		zookeeper.feed(tiger); // feed�޼ҵ� ȣ���� argument�� ������ ���� �� ���� 
		zookeeper.feed(lion);
	}
}
