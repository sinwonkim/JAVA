package singletontest;

public class SingleTest {

	public static void main(String[] args) {
		 Singleton a = Singleton.getsingletone(); //static 클래스의 static 메소드 호출
		 Singleton b = Singleton.getsingletone(); 
		 a.setA(3);
		 b.printA();

	}
}	
	
	class Singleton {
		private static Singleton test;
		private int a = 0;
		
		public static Singleton getsingletone() {
			if(test == null) {
				test = new Singleton();
			}
			return test;
		}
		
		public void setA(int i) {
			a = i;
		}
		
	    public void printA() {
	    	System.out.println("변수 i의 값"+a);
	    }
	
	}


