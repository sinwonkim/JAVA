package abstractPackage;

public class abClass {

	public static void  main(String[] args) {
		BB bb = new BB();
		bb.test();
	}
}
	abstract class AA {
		
			public AA() {
				System.out.println("�߻�Ŭ������ �����ڵ� ���� �� �ִ�.");
			}
			
			public abstract void test(); // �߻�޼ҵ� 
	}
	
	class BB extends AA {

		@Override
		public void test() {
			// TODO Auto-generated method stub
			System.out.println("�̷������� �θ� Ŭ������ �߻�Ŭ������ ��ӹ޾� �߻� �޼ҵ�� �������ؼ� ����Ұ�");
		}
		
	}

