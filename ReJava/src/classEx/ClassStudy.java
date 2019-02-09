package classEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassStudy {
	static int currentSpeedM;
	
	public static void main(String[] args) {
		CarClass carclass = new CarClass(); // CarClass Ŭ������ new������ ����ؼ� ��ü�� ����� �ִ�.
			 
		 currentSpeedM = carclass.speedUp();
		 currentSpeedM = carclass.speedDown();
		 
		System.out.println("���� �ӵ��� "+currentSpeedM+"km/h �Դϴ�.");
	
	}
}

// ���赵 ������ �ϴ� Ŭ����    �� �ڵ��� Ŭ������ ����� �ű⿡ �Ӽ� ������ currentSpeed ���� , �ൿ���� ���ǵ� up,down �޼ҵ带 ����� ��� 
class CarClass{
	 
	int currentSpeed; // ����ӵ�
	
	// �ӵ� ������Ű�� ����
	public int speedUp() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �ӵ��� �Է��ϼ���");
		try {
		int a = scanner.nextInt();
		currentSpeed += a;
		
		}catch(InputMismatchException e) {
			System.out.println("���ڷ� �Է����ּ���");
			scanner.next();
			speedUp();
			
		}
		
		
		return currentSpeed;
	}
	
	public int speedDown() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �ӵ��� �Է��ϼ���");
		int a = scanner.nextInt();
		
		currentSpeed -= a;
		
		return currentSpeed;
	}
}
