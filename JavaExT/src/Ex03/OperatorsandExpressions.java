package Ex03;

public class OperatorsandExpressions {
/*
 *프로그램에서 데이터를 처리하여 결과를 산출하는 것을 연산(operation)이라고 한다. 
 *연산에 사용되는 표시나 기호를 연산자(operator)라고 하고, 연산되는 데이터는 피연산자(operand)라고 한다. 
 *연산잔(operator)와 피연산자(operand)를 이용하여 연산의 과정을 기술한 것을 연산식(expressions)라고 부른다.
 *
 *기본 타입(byte, char, short, int, long, float, double, boolean)인 변수의 값을 비교할떄에는 == 연산자를 사용하지만
 *참조 타입인 String 변수를 비교할때 == 연산자를 사용하면 원하지 않는 결과가 나올 수 있다. 
 * */
	
	// 삼항 연산자 
	/*
	 * 삼항 연산자? 는 세 개의 피연산자를 필요로 하는 연산자를 말한다. 
	 * 삼항 연산자는 ? 앞의 조건식에 따라 콜론(:) 앞뒤의 피연산자가 선택된다고 해서 조건 연산식이라고 부르기도 한다.
	 * 삼항 연산자를 사용하는 방법은 다음과 같다.
	 * 
	 * 조건식(피연산자1) ? 값 또는 연산식(피연산자2) : 값 또는 연산식(피연산자3)
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
		
		int score = 85;
		char grade = (score > 90 ) ? 'A' : ((score > 80 ) ? 'B' : 'C');
		
		String name = "ain";
		boolean CheckName = name == "sin" ? true : false;
		System.out.println(CheckName);
		
		
	}
	
}
