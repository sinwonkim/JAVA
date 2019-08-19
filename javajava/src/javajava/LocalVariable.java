package javajava;

public class LocalVariable {
	int value1 = 50;
	
	int result2 = value1;
	public static void main(String[] args) {
		int value = 10; 
		int asdaasd = 20;
		
		int result = value+asdaasd;
		System.out.println(result);
		//만약 제어문 내에서 잠깐 사용되는 변수라면 제어문 내에서 선언하는 것이 좋다.
		
		int v1 = 15;
		if(v1>10) {
			System.out.println("v1은 10보다 큽니다.");
		}else {
			System.out.println("v1은 10보다 작습니다.");
		}
	}
	// int v3 = v1+v2+5; //  v1과 v2 v1은 로컬변수고 v2는 선언조차도 안되서 
	
}
