package Animal;

public class Bouncer {
	public void barkAnimal(Barkable animal) {
		/*if(animal instanceof Tiger) {
			System.out.println("어흥");
		} else if(animal instanceof Lion) {
			System.out.println("으르렁");
		}*/
		animal.bark(); // 파라미터로 들어오는 개체의 메소드를 호출 할 뿐 
	}
	
	
	public static void main(String[] args) {
		Tiger tiger = new Tiger(); // Tiger의 객체 tiger
		Lion lion = new Lion(); // Lion의 객체 lion
		
		Bouncer bouncer = new Bouncer();
		bouncer.barkAnimal(tiger);
		bouncer.barkAnimal(lion);
	}
}
