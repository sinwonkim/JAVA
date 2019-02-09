package classEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassStudy {
	static int currentSpeedM;
	
	public static void main(String[] args) {
		CarClass carclass = new CarClass(); // CarClass 클래스를 new연산자 사용해서 객체를 만들고 있다.
			 
		 currentSpeedM = carclass.speedUp();
		 currentSpeedM = carclass.speedDown();
		 
		System.out.println("현재 속도는 "+currentSpeedM+"km/h 입니다.");
	
	}
}

// 설계도 역할을 하는 클래스    난 자동차 클래스를 만들어 거기에 속성 값으로 currentSpeed 선언 , 행동으론 스피드 up,down 메소드를 만들어 사용 
class CarClass{
	 
	int currentSpeed; // 현재속도
	
	// 속도 증가시키는 동작
	public int speedUp() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("증가할 속도를 입력하세요");
		try {
		int a = scanner.nextInt();
		currentSpeed += a;
		
		}catch(InputMismatchException e) {
			System.out.println("숫자로 입력해주세요");
			scanner.next();
			speedUp();
			
		}
		
		
		return currentSpeed;
	}
	
	public int speedDown() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("감속할 속도를 입력하세요");
		int a = scanner.nextInt();
		
		currentSpeed -= a;
		
		return currentSpeed;
	}
}
