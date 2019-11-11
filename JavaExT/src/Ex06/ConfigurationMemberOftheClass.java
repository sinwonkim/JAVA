package Ex06;

public class ConfigurationMemberOftheClass {
	String myName; // Field 객체의 데이터가 저장되는 곳
	
	ConfigurationMemberOftheClass() {
		// Constructor  객체 생성 시 초기화 역할 담당
	}
	
	public void systemOut() {
		System.out.println("method"); // method 객체의 동작에 해당하는 실행 블록
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 클래스에는 객체가 가져야 할 구성 멤버가 선언된다.
		 * 구성 멤버에는 필드(Field), 생성자(Constructor) 
		 *  메소드(Method)가 있다.  이 구성 멤버들은 복수 개가 작성 될 수 있다.
		 *  
		 * 필드는 객체의 고유 데이터, 부품 객체, 상태 정보를 저장하는 곳이다. 
		 * 선언 형태는 변수(variable)와 비슷 하지만, 필드는 변수라고 부르지 않는다.
		 * 변수는 생성자와 메소드 내에서만 사용되고 생성자와 메소드가 실행 종료되면 자동 소멸된다.
		 * 하지만 필드는 생성자와 메소드 전체에서 사용되며 객체가 소멸되지 않는 한 객체와 함께 존재한다.
		 * 
		 * 생성자는 new 연산자로 호출되는 특별한 중괄호 {} 블록이다. 생성자의 역할은
		 * 객체 생성시 초기화를 담당한다. 필드를 초기화하거나, 메소드를 호출해서 객체를 사용할 준비를 한다.
		 * 생성자는 메소드와 비슷하게 생겼지만, 클래스 이름으로 되어 있고 리턴 타입이 없다.
		 * 
		 * 메소드는 객체의 동작에 해당하는 중괄호 {}블록을 말한다. 중괄호 블록은 이름을 가지고 있는데,
		 * 이것이 메소드 이름이다. 메소드를 호출하게 되면 중괄호 블록에 있는 모든 코드들이 일괄적으로 실행된다.
		 * 메소드는 필드를 읽고 수정하는 역할도 하지만, 다른 객체를 생성해서 다양한 기능을 수행하기도 한다.
		 * 메소드는 객체간의  데이터 전달의 수단으로 사용된다. 외부로부터 매개값을 받을 수도 있고, 
		 * 실행 후 어떤값을 리턴할 수도 있다. 
		 * 필드는 객체의 고유 데이터, 객체가 가져야 할 부품, 객체의 현재 상태 데이터를 저장하는 곳이다.
		 * 
		 *  필드 선언은 클래스 중괄호{} 블록 어디서든 존재할 수 있다. 
		 *  하지만 생성자와 메소드 중괄호 블록 내부에는 선언될 수 없다.
		 *  생성자와 메소드 중괄호 블록 내부에 선언된 것은 모두 local variable이 된다. 
		 *  필드 선언은 변수의 선언 형태와 비슷하다. 그래서 일부 사람들은 클래스 멤버라 부르는데 filed라고 부를것 
		 *  
		 *  타입은 필드에 저장할 데이터의 종류를 결정한다. 
		 *  타입에는 기본타입(byte, short, int, long, float, double, boolean)과 참조타입(Array, class, interface)이
		 *  모두 올 수 있다. 필드의 초기값은 필드 선언 시 주어질 수도 있고, 생략될 수도 있다.
		 *  
		 *  String company = "ha" // String 타입으로 선언과 초기화 
		 *  
		 *  초기값이 지정되지 않은 필드들은 객체 생성 시 자동으로 기본 초기값으로 설정된다. 
		 *  
		 *  필드를 사용한다는 것은 필드값을 일고, 변경하는 작업을 말한다. 
		 *  필드를 사용한다는 것은 필드값을 일고, 변경하는 작업을 말한다. 
		 *  클래스 내부의 생성자나 메소드에서 사용할 경우 단순히 필드 이름으로 읽고 변경하면 되지만, 
		 *  클래스 외부에서 사용할 경우 우선적으로 클래스로부터 객체를 생성한 뒤 필드를 사용해야 한다. 
		 *  그 이유는 필드는 객체에 소속된 데이터이므로 객체가 존재하지 않으면 필드도 존재하지 않기 때문이다.
		 *  
		 *  public class Person {
		 *  
		 *  	void method() {
		 *  	Car car = new Car();
		 *  	car.speed = 60;
		 *  	}
		 *  }
		 *  
		 *  public class Car {
		 *  	int speed; // field
		 *  
		 *  	Car() {
		 *  		Speed = 0; // 초기화 
		 *  	}
		 *  
		 *  	void method() {
		 *  	speed = 10;
		 *  }
		 *  }
		 * 	생성자(Constructor)는 new 연산자와 같이 사용되어 클래스로부터 객체를 생성할 떄 호출되어 객체의 
		 *  초기화를 담당한다. 객체 초기화란 필드를 초기화하거나, 메소드를 호출해서 객체를 사용할 준비를 
		 *  하는 것을 말한다. 생성자를 실행시키지 않고는 클래스로부터 객체를 만들 수 없다
		 *  new 연산자에 의해 생성자가 성공적으로 실행되면 힙 영역에 객체가 생성되고 객체의 주소가 리턴된다.
		 *  리턴된 객체의 주소는 클래스 타입 변수에 저장되어 객체에 접근할 떄 이용된다.
		 *  만약 생성자가 성공적으로 실행되지 않고 예외(에러)가 발생했다면 객체는 생성되지 않는다.
		 *  
		 *  기본 생성자 
		 *  모든 클래스는 생성자가 반드시 존재하며, 하나 이상을 가질 수 있다. 우리가 클래스 내부에 생성자
		 *  선언을 생략했다면 컴파일러는 중괄호 블록 내용이 비어있는 기본 생성자(Default Constructor)를 바이트
		 *  코드에 자동 추가시킨다.
		 *  
		 *  생성자는 메소드와 비슷한 모양을 가지고 있으나, 리턴 타입이 없고 클래스 이름과 동일하다. 
		 *  생성자 블록 내부에는 객체 초기화 코드가 작성되어 있는데, 일반적으로 필드에 초기값을 저장하거나 
		 *  메소드를 호출하여 객체 사용전에 필요 준비를 한다. 
		 *  
		 *  생성자 오버로딩
		 *  외부에서 제공되는 다양한 데이터들을 이용해서 객체를 초기화하려면 생성자도 다양화할 필요가 있다.
		 *  생성자 오버로딩
		 *  -> 매개 변수를 달리하는 생성자를 여러개 선언하는 것을 말한다. 
		 *  생성자 오버로딩 시 주의할 점은 -> 매개 변수의 타입과 개수, 그리고 선언된 순서가 똑같을 경우 매개 변수 
		 *  								  이름만 바꾸는 것은 생성자 오버로딩이라고 볼 수 없다. 
		 *  
		 *  생성자가 오버로딩이 되어 있을 경우, new 연산자로 생성자를 호출할 떄 제공되는 매개값의 
		 *  타입과 수에 의해 호출될 생성자가 결정된다. 
		 *  
		 *  메소드는 객체의 동작에 해당하는 중괄호{} 블록을 말한다. 
		 *  메소드를 호출하게 되면 중괄호 블록에 있는 모든 코드들이 일괄적으로 실행된다. 
		 *  메소드는 필드를 읽고 수정하는 역할도 하지만, 다른 객체를 생성해서 다양한 기능을 수행하기도 한다.
		 *  메소드는 객체간의 데이터 전달의 수단으로 사용된다. 외부로부터 매개값을 받을 수도 있고, 
		 *  실행 후 어떤 값을 리턴할 수도 있다.
		 *  
		 *  메소드 선언은 선언부(리턴타입, 메소드이름, 매개변수선언)와 실행 블록으로 구성된다.
		 *  메소드 선언부를 메소드 시그니처(signature)라고도 한다. 
		 *  
		 *  리턴타입 메소드이름(매개변수선언) { 
		 *  	실행할 코드를 작성하는 곳 
		 *  }
		 *  
		 *  리턴 타입은 메소드가 실행 후 리턴하는 값의 타입을 말한다.
		 *  메소드는 리턴값이 있을수도 있고 없을 수도 있다. 메소드가 실행후 결과를 호출한 곳에 넘겨줄 경우에는 
		 *  리턴값이 있어야 한다. 리턴값이 있느냐 없느냐에 따라 메소드를 호출하는 방법이 조금 다르다.
		 *  
		 *  리턴 타입이 있다고 해서 반드시 리턴값을 변수에 저장할 필요는 없다.
		 *  리턴값이 중요하지 않고, 메소드 실행이 중요할 경우에는 변수 선언 없이 메소드를 호출할 수 있다.
		 *  
		 *  매개변수 선언
		 *  매개 변수는 메소드가 실행할 때 필요한 데이터를 외부로부터 받기 위해 사용한다. 
		 *  매개변수도 필요한 경우도 있고 필요 없는 경우가 있다. 
		 *  
		 *  매개 값은 반드시 매개 변수의 타입에 부합되는 값이어야 한다. 
		 *  
		 *  메소드의 매개 변수는 개수가 이미 정해져 있는 것이 일반적이지만, 경우에 따라서는 
		 *  메소드를 선언할 때 매개변수의 개수를 알 수 없는 경우가 있다. 
		 *  몇 개의 매개 변수가 입력될지 알 수 없기 때문에 매개 변수의 개수를 결정할 수 없을 것이다.
		 *  해결 책은 매개 변수를 배열 타입으로 선언하는 것이다.
		 *  
		 *  리턴문 
		 *  리턴값이 있는메소드
		 *  메소드 선언에 리턴 타입이 있는 메소드는 반드시 리턴문을 사용해서 리턴값을 지정해야 한다.
		 *  만약 return문이 없다면 컴파일 오류가 발생한다. 
		 *  return문이 실행되면 메소드는 즉시 종료된다.
		 * 
		 * */
		
		 
		
	}

}
