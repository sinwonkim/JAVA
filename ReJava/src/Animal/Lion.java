package Animal;

public class Lion extends Animal  implements Predator,Barkable {

	@Override // Predator���� ����  getFood��� �޼ҵ带 �����ؾ��� 
	public String getFood() {
		
		return "banana";
	}

	@Override
	public void bark() {
		System.out.println("������ ȣ����");
		
	}


}
