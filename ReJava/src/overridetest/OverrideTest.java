package overridetest;

public class OverrideTest {
	
	public static void main(String[] args) {
		
	B	b= new B();
	b.justOutput();
	b.test2();
	}
}	
	 class A {
		int i = 0;
		
		public void justOutput() {
			System.out.println("AŬ������ �ƿ�ǲ �޼ҵ�"+"i: "+i);
		}
	}
	
	 class B extends A {
		@Override
		public void justOutput() {
			System.out.println("�ڽ� Ŭ����");
		}
		
		public void test2() {
			super.justOutput();
		}
		
	}

