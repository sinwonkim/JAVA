package Arrays;

public class ArraysEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 배열 항목에 저장될 값의 목록이 있다면 다음과 같이 간단하게 배열을 만들 수 있다.
		 * 
		 * 
		 */
		
		int[] Arrays = {10,20,30};
		
		//중괄호 {}는 주어진 값들을 항목으로 가지는 배열 객체를 힙에 생성하고, 배열 객체의 번지를 리턴한다.
		// 배열 변수 Arrays는 리턴된 번지를 저장함으로써 참조가 이루어진다.
		// 이렇게 생성된 Arrays[0]  Arryas[1]   Arryas[2]
		// 이렇게 생성된 배열에서 Arrays[0]인덱스를 바꾸고 싶다면  
		Arrays[0] = 40; 
		
		for(int i = 0; i<Arrays.length; i++) {
			System.out.println(i+"번째 인덱스의 값은 : "+Arrays[i]);
		}
		
	}

}
