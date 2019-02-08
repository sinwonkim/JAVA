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
			System.out.println("A클래스의 아웃풋 메소드"+"i: "+i);
		}
	}
	
	 class B extends A {
		@Override
		public void justOutput() {
			System.out.println("자식 클래스");
		}
		
		public void test2() {
			super.justOutput();
		}
		
	}

