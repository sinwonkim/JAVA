package Animal;

public class Bouncer {
	public void barkAnimal(Barkable animal) {
		/*if(animal instanceof Tiger) {
			System.out.println("����");
		} else if(animal instanceof Lion) {
			System.out.println("������");
		}*/
		animal.bark(); // �Ķ���ͷ� ������ ��ü�� �޼ҵ带 ȣ�� �� �� 
	}
	
	
	public static void main(String[] args) {
		Tiger tiger = new Tiger(); // Tiger�� ��ü tiger
		Lion lion = new Lion(); // Lion�� ��ü lion
		
		Bouncer bouncer = new Bouncer();
		bouncer.barkAnimal(tiger);
		bouncer.barkAnimal(lion);
	}
}
