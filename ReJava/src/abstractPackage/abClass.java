package abstractPackage;

public class abClass {

	public static void  main(String[] args) {
		BB bb = new BB();
		bb.test();
	}
}
	abstract class AA {
		
			public AA() {
				System.out.println("추상클래스는 새성자도 만들 수 있다.");
			}
			
			public abstract void test(); // 추상메소드 
	}
	
	class BB extends AA {

		@Override
		public void test() {
			// TODO Auto-generated method stub
			System.out.println("이런식으로 부모 클래스를 추상클래스를 상속받아 추상 메소드는 재정의해서 사용할것");
		}
		
	}

