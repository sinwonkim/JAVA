package Ex04;

public class CodeExecutionFlowControl {
/*
 * 자바 프로그램을 시작하면 main() 메소드의 시작 중괄호 { 에서 시작해서 끝 중괄호 } 까지 위에서 아래로 
 * 실행하는 흐름을 가지고 있다. 이러한 실행 흐름을 개발자가 원하는 방향으로 바꿀 수 있도록 해주는 것이 흐름 제어문이다.
 * 제어문의 종류는 조건문과 반복문이 있는데, 조건문에는 if문, switch문이 있고 반복문에는 for문, while문, do-while문이 있다.
 * 조건문일 경우에는 정상 흐름으로 돌아오지만, 반복문일 경우는 제어문 처음으로 다시 돌아가 반복 실행한다. 이것을
 * 루핑(looping)이라고 한다. 
 * 제어문 블록 내부에는 또 다른 제어문을 사용할 수 있다. if문 내부에 for문을 가질 수 있고, while문도 가질 수 있다. 
 * 
 * if문 if( 조건식 ) { 
 * 
 * 		조건식이 true
 * }
 * 
 * 중괄호 블록 { }은 여러 개의 실행문을 하나로 묶기 위해 작성된다. 만약 조건식이 ture가 될 떄 실행해야 할 문장이
 * 하나밖에 없다면 생략할 수 있다. 하지만 중괄호 {} 블록을 생략하지 않고 작성하는 것을 추천한다.
 * 
 * switch문 
 * switch문은 if문과 마찬가지로 조건 제어문이다. switch문은 if문처럼 조건식이 true 일 경우에 블록 내부의
 * 실행문을 실행하는 것이 아니라 변수가 어떤 값을 갖느냐에 따라 실행문이 선택된다.
 * if문은 조건식의 결과가 true, false 두 가지 밖에 없기 떄문에 if문은 조건식의 결과가 true, false 두 가지밖에 
 * 없기 때문에 경우의 수가 많아질수록 else-if를 반복적으로 추가해야 하므로 코드가 복잡해진다. 그러나 switch문은 
 * 변수의 값에 따라서 실행문이 결ㅈ어되기 때문에 같은 기능의 if문보다 코드가 간결하다. 
 * 
 * switch(변수) {
 *  case 값1:
 *  
 *  	break;
 *  
 *  case 값2:
 *  	break;
 *  
 *  default:
 *  
 * }
 * */
	
	public static void main(String[] args) {
		
		int num = (int) (Math.random()*6) + 1;
		
		switch(num){
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
			
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
			
		case 3: 
			System.out.println("3번이 나왔습니다.");
			break;
			
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
			
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
			
		default:
			System.out.println("6번이 나왔습니다.");
			break;
		}
	}
	
	// for문이 정해진 횟수만큼 반복한다면, while문은 조건식이 true일 경우에 계속해서 반복한다. 조건식에는 비교 또는 논리 연산
	// 식이 주로 오는데, 조건식이 false가 되면 반복 행위를 멈추고 while문을 종료한다. 
}
