package FcamCh05;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strVar1 = "samsung";
		String strVar2 = "samsung";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2가 참조가 같다.");
		}else {
			System.out.println("strVar1과 strVar2가 참조가 같지 않습니다.");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2가 문자열이 같다.");
		}
		// String 변수는 참조 타입이므로 초기값으로 null을 대입할 수 있다. null은 String 변수가 참조하는 String 객체가 없다는 뜻이다.
		// 참조 되지 않은 객체를 JVM은 쓰레기 객체로 취급하고 쓰레기 수집기 Gabage Collecotr를 구동시켜 메모리에서 자동 제거한다.
	}

}
