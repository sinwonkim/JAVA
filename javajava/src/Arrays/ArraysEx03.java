package Arrays;

public class ArraysEx03 {
	// Java 클래스 프로그램을 실행하면 JVM은 길이가 0인 String 배열을 먼저 생성하고 main() 메소드를 호출할 때 매개값으로 전달
	String[] args = {};
	
	public static void main(String[] args) {
		// new 연산자로 배열 생성 
		// 값의 목록을 가지고 있지 않지만, 향후 값들을 저장할 배열을 미리 만들고 싶다면 new 연산자로 다음과 같이 배열 객체를 생성 시킬 수 있따.
		
		String[][] names = new String[][]{};
		String[] classA = new String[] {"3","4"};
		System.out.println(classA[0]);
		String[] classB = new String[] {"7","8"};
		// classB,  값이 저장될 수 있는 공간을 확보하고 배열의 생성 번지를 리턴한다. 리턴된 번지는 classB에 저장된다. 
		// 배열의 길이를 얻으러면 배열 객체의 length 필드를 읽으면 된다. 필드는 객체 내부의 데이터를 말한ㄷ. length는 읽기 전용 필드이기 때문에 값을 바꿀 수가 없다. 
		
		// 메인 메소드의 매개값인 String[] args가 왜 필요한 것인지  java 클래스로 프로그램을 실행하면 JVM은 길이가 0인 String 배열을 먼저 생성하고 main() 메소드를 호출할 떄 매개값으로 전달
		
		
	}

}
