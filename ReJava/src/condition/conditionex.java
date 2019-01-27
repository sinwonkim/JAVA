package condition;

public class conditionex {	
	public static void main(String[] args) {		
		/*int i = 0;
		int total = 0 ;
		
		while(i < 5) {
		total += i ; 
			i++;	
		}
		System.out.println("1부터 4까지의 합은? "+total+" 입니다.");
		*/
		
		// 1부터 10까지의 곱의 결과를 출력하는 프로그램을 for문으로 이용해서 작성해보자
		int total = 0 ;
		/*for(int i = 0 ; i <= 10; i++) {
			total += 1 * i;
		}
		System.out.println(total);*/
		
		//5단  5x1 = 5   5 x 2 = 10 
		
		for(int i = 1 ; i < 10; i++ ) {
			total = 5 * i ;
			System.out.print(total+" ");
		}
		
	}
	
	
}
