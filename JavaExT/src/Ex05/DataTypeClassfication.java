package Ex05;

public class DataTypeClassfication {
	/*
	 * DataType classfication 
	 * 프로그램이 하는 일은 결국 데이터를 처리하는 것이다. 따라서 데이터를 얼마나 잘 다루냐에 따라 
	 * 좋은 프로그램을 작성할 수 있는 관건이 된다. 자바에서 지원하는 데이터 타입에는 크게
	 * 기본 타입(원시타입:primitive type)과 참조타입 (reference type)으로 분류된다.
	 * 
	 */
	
	/*
	 * 프로그램이 하는 일은 결국 데이터를 처리하는 것이다. 
	 * 자바의 데이터 타입에는 크게 기본타입(원시 타입 primitive type) 과 참조타입(reference type) 
	 * 
	 * */
	
	// Java type       1.primitive type ex) int, double,char,boolean     2.reference type ex) object, arrays, class 
	/*
	 * 자바의 데이터 타입에는 크게 기본타입(원시 타입primitive type)과 참조타입(reference type)으로 분류된다.
	 * 기본 타입이란 정수 실수, 문자, 논리 리터럴을 저장하는 타입을 말한다.
	 * 
	 * 참조 타입이란 객체의 번지를 참조하는 타입으로 배열, 열거 , 클래스, 인터페이스 타입을 말한다. 
	 * 
	 * 참조 타입에 중점을 두려고 한다. 참조 타입이란 객체(Object)의 번지를 참조하는 타입으로 배열, 열거 ,클래스 , 인터페이스
	 * 
	 * 
	 * 기본 타입으로 선언된 변수와 참조 타입으로 선언된 변수의 차이점은 저장되는 값이 무엇이냐이다, 
	 * 기본 타입인 byte, char, short, int, long, float, double, boolean을 이용해서 선언된 변수는 
	 * 실제값을 변수안에 저장하지만, 참조타입인 배열, 열거, 클래스, 인터페이스를 이영헤사 선언된 변수는 
	 * 메모리의 번지를 값으로 갖는다. 번지를 통해 객체를 참조한다는 뜻에서 참조 타입이라고 부른다.
	 * */
	
	// primitive type variable
// 	int age = 25; 
	//double price = 100;
	
	// reference type variable


	
	// 변수는 스택에 쌓이고 , 객체는 힙 영역에 생성된다는 것 
	// int 와 double 변수인 age와 price는 직접 값을 저장하고 있지만, String 클래스 변수인 name과 hobby는 
	// 힙 영역에 String 객체의 주소 값을 가지고 있다. 주소를 통해 객체를 참조한다는 뜻에서 String 클래스 
	// 변수를 reference type variable 
	
	/*
	 * java.exe로 JVM이 시작되면 JVM은 운영체제에서 할당받은 메모리 영역(Runtime Data Area)을 다음과 같이
	 * 세부 영역으로 구분해서 사용한다. 메소드 영역, 힙 영역, 스레드 
	 * 메소드 영역에는 코드에서 사용되는 클래스들을 클래스 로더로 읽어 클래스별로 런타임 상수풀
	 * , field data, method data, method code, constructor 코드등을 분류해서 저장한다
	 * 
	 */
	
	/*
	 * 힙 영역은 객체와 배열이 생성되는 영역이다. 힙 영역에 생성된 객체와 배열은 JVM 스택 영역의
	 * 변수나 다른 객체의 필드에서 참조한다. 
	 * 참조하는 변수나 필드가 없다면 의미 없는 객체가 되기 때문에 이것을 쓰레기로 취급하고 JVM은 
	 * 쓰레기 수집기를 실행시켜 쓰레기 객체를 힙 영역에서 자동으로 제거한다. JVM
	 * 스택영역 JVM은 스택 영역은 각 스레드마다 하나씩 존재하며 스레드가 시작될 때 할당된다.
	 * 자바 프로그램에서 추가적으로 스레드를 생성하지 않았다면 MAIN 스레드만 존재하므로 jvm
	 * 스택도 하나이다. 
	 * jvm 스택은 메소드를 호출할 때마다 Frame을 추가push하고 메소드가 종료되며 해당 프레임을
	 * 제거(pop)하는 동작을 수행한다. 예외 발생시 printStackTrace() 메소드로 보여주는 Stack Trace의
	 * 각 라인은 하나의 프레임을 표현한다. 
	 * 프레임 내부에는 로컬 변수 스택이 있는데, 기본 타입 변수와 참조 타입 변수가 추가(push)되거나
	 * 제거(pop)된다. 즉 최초로 변수에 값이 저장될 때이다. 
	 * 변수는 선언된 블록 안에서만 스택이 존재하고 블록을 벗어나면 스택에서 제거된다. 
	 * 
	 * 
	 * 
	 * */
	
	
	

	// 참조 변수==, != 연산 
	// 동일한 주소 값을 갖고 있다는 것은 동일한 객체를 참조한다는 뜻이다.
	
	
	
	
	

}