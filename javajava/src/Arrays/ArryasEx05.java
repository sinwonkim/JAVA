package Arrays;

public class ArryasEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메소드의 매개값이 배열일 경우에도 값의 목록으로 배열을 생성시에는 반드시 new 연산자를 사용할 것 
		
		int[] scores; // 배열 생성 null 로 초기화된 상태 
		 scores = new int [] {10,20,30}; // new 연산자를 사용하여 값 목록으로 배열을 생성해야 한다.  안그러면 compile 에러 뜬다.
		
		int sum2 = add(new int[] {30,40,50});
		System.out.println(sum2);
		
		 
	}
	static int add(int[] scores) {
		
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
			
		}
		return sum; 
	}

}
