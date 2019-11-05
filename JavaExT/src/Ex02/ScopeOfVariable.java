package Ex02;

public class ScopeOfVariable {
	public static void main(String[] args) {
//		모든 변수에는 타입 type이 있으며 타입에 따라 저장할 수 있는 값의 종류와 범위가 달라진다. 
//		메모리에는 0과 1을 저장하는 최소 기억 단위인 비트(bit)가 있다. 8개의 비트를 묶어서 byte라고 한다. 
		/*
		 * 8bit  == 1byte  byte 타입은 색상 정보 및 파일 또는 이미지등의 이진(binary) 데이터를 처리할 떄 주로 사용된다.
		 * char 타입 변수는 단 하나의 문자만 저장한다. 만약 문자열을 저장하고 싶다면 String 타입을 사용해야 하는데, 
		 * 다음과 같이 String 타변수를 선언하고 char 타입 변수는 단 하나의 문자만 저장한다. 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
		char c1 = 'A'; // 문자를 직접 저장 
		char c2 = 65; 	// 10진수로 저장
		char c3 = '\u0041'; // 16진수로 저장
		
		// System.out.println(c1);
		// System.out.println(c2);
		// System.out.println(c3); 
		// 만약 문자열을 출력하고 싶다면 String 타입을 사용해야 하는데, 다음과 같이 String 변수를 선언하고, 큰 따옴표로 감싼 
		// 문자열 리터럴을 대입하면 된다.
		
		String name ="devopssin";
		
		//String 은 기본 타입이 아니다. String 은 클래스 타입이고 String 변수는 참조 변수이다. 
		// 문자열을 String 변수에 대입하여 문자열이 변수에 직접 저장되는 것이 아니라, String 객체가 생성되고, String 변수는
		// String 객체의 번지를 참조하게 된다. 
		
		// 논리 타입(boolean)
		/*
		 * boolean 타입은 1byte(8bit)로 표현되는 논리값(true/false)을 저장할 수 있는 데이터 타입이다. 
		 * boolean 타입은 두 가지 상태값을 저장할 필요성이 있을 경우에 사용되며, 상태값에 따라 조건문과 제어문의 
		 * 실행 흐름을 변경하는데 주로 이용된다. 
		 * 
		 * */
		boolean value;
		
		int age = 28; 
		if(age == 28) {
			 value = true;
		}else {
			 value = false;
		}
		 
		if(value == true) {
			System.out.println("맞는 나이 입니다.");
		}else {
			System.out.println("나이가 맞지 않습니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
