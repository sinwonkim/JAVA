package javajava;

public class CodeExcutionFlowControl {
	//코드 실행 흐름제어 
	// 자바 프로그램을 시작하면 main() 메소드의 시작 중괄호 {} 위에서 아래로 실행하는 흐름을 가지고 있다. 
	// 이러한 실행 흐름을 개발자가 원하는 방향으로 바꿀 수 있도록 해주는 것이 흐름 제어문이다. 흐름 제어문을 간단히 제어문이라고 한다. 
	// 제어문은 조건식과 중괄호{} 블록으로 구성되는데, 조건식의 연산 결과에 따라 블록 내부의 실행 여부가 결정된다. 
	
	// 제어문(조건식) { } 
	// 제어문의 종류는 조건문과 반복문이 있는데 조건문에는 if, switch문이 있고 
	// 반복문에는 for문, while문, do-while문이 있다. 
	// if(조건식) { }  
	// if(조건식) {  
	   // 실행문;
	   // 실행문; 
 // }
 //
	public static void Sysout() {
		 System.out.println("sysout 입니다.");
	 }
	
	public static void main(String[] args) {
		int score=90;
		if(score >=89) {
			System.out.println((int)(Math.random()* 6)+1);
		}
	}
	
}
