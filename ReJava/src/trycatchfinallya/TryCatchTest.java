package trycatchfinallya;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchTest {
	public static void main(String[] args) {
		IntTypeClass intTypeClass= new IntTypeClass();
		 Scanner scanner = new Scanner(System.in);
		 TestScanner testScanner = new TestScanner();
		 System.out.println("������ ��� �ݾ���?");
		intTypeClass.multiply(testScanner.input());
	}
}

class IntTypeClass {
	int sum = 0;
	public void multiply(int a) {
		sum+=a;
		System.out.println("������ ���ݾ��� "+a+" �Դϴ�. ���ݱ��� �� ���ݾ��� "+sum +"�Դϴ�.");
	}
}

class TestScanner{
	Scanner scanner = new Scanner(System.in);
	int a = 0;
	
	public int input() {
		
		try {
			a = scanner.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("���ڷ� �Է����ּ���");
			scanner.next();
			input();
		}
		return a;
	}
	

}
