package chapter6;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		cal.powerOff();
		
		int result1 = cal.plus(10, 20);
		
		 byte x = 10; 
		 byte y = 4; 
		 double result2  = cal.divide(x, y);
		 System.out.println("result2 : " + result2);
		  
		 cal.powerOff();
		
		 // 매개변수의 수를 모를 경우 
		 // 메소드의 매개변수는 개수가 이미 정해져 있는 것이 일반적이지만, 경우에 따라서는 메소드를 선언할 떄 매개변수의 개수를 알 수 없는 경우가 있다. 
		 // 예를 들어 여러개의 수를 모두 합산하는 메소드를 선언해야 한다면, 몇 개의 매개변수가 입력될지 알수 없기 떄문에 매개변수의 개수를 결정할 수 없는 것이다.
		 // 해결책은 매개변수를 배열 타입으로 선언하는 것이다.
		 
		 //  메소드 선언에 리턴 타입이 있는 멧도느느 반드시 리턴문을 사용해서 리턴값을 지정해야 한다. 만약 return 문이 없다면 컴파일 오류가 발생한다. return문이 실행되면
		 // 메소드는 즉시 종료된다. return문 이후에 오는 실행문이 있으면 Unreachable code라고 뜬다. return문 이후 실행문은 결코 실행되지x 
		 
		 // 메소드 오버로딩 클래스 내 같은 이름의 메소드를 여러개 선언하는 것을 메소드 오버로딩이라고 한다. 메소드 오버로딩 조건은 매개변수의 타입, 개수, 순서중 하나가 달라야 한다.
	}

}
