package javajava;

public class DataType {
	//모든 타입에는 type이 있으며, 타입에 따라 저장할 수 있는 값의 종류와 범위가 달라진다. 
	/*변수를 선언할 때 주어진 타입은 변수를 사용하는 도중에 변경할 수 없다.*/
	
	// 따라서 변수를 선언할 때 어떤 타입을 사용할지 충분히 고려해야 한다.
	
	// 기본 (원시) 타입이란 정수, 실수, 문자, 논리 리터럴을 직접 저장하는 타입을 말한다. 
	// 정수 타입에는 byte, char, short, int, long이 있고, 실수 타입에는 float, double이 있다. 
	// 그리고 논리 타입에는 boolean이 있다. 
	// 자바 모든 문자를 유니코드로 처리한다. Unicode  유니코드 하나의 문자에 대해 하나의 코드값을 부여하기 때문에 영문 'A' 및 한글 '가'도 하나의 코드값을 갖는ㄷ.
	
	static char c = 65; // 10진수로 저장 
	char cd = '\u0041';
	public static void main(String[] args) {
		System.out.println(c); 
		String name ="aas";
		name = "add";
		System.out.println(name	);
		// 타입변환이란 데이터 타입을 다른 데이터 타입으로 변환하는 것을 말한다. 예를 들어 byte 타입을 int 타입으로 변환하거나 반대로
		// int타입을 byte 타입으로 변환하는 행위를 말한다. 자동(묵시적)  자동 타입 변환 promotion은 프로그램 실행 도중 자동적으로 타입변환이 
		//일어나는 것을 말한다.  자동 타입 변환은 작은-> 큰 크기를 가지는 타입에 저장될 때 발생한다. 
	}
	
}
