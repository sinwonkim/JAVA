package Ex05;

public class Arrays {

	/*
	 * 배열이란? 배열 같은 타입의 데이터만 저장할 수 있다. 
	 * 같은 타입의 많은 양의 데이터를 다루는 프로그램에서는 좀 더 효율적인 방법이 필요한데 이것이 배열이다.
	 * 배열은 같은 타입의 데이터를 연속된 공간에 나열시키고, 각 데이터에 인덱스(index)를 부여해 놓은 자료구조이다.
	 * 
	 * */
	public static void main(String[] args) {
		// 타입[] 변수; 
		// 타입 변수[];
		int[] intArray = {1,2,3,4,5}; // 중괄호 {}는 주어진 값들을 항목으로 가지는 배열 객체를 힙에 생성하고, 
		 							  // 배열 객체의 번지를 리턴한다. 배열 변수는 리턴된 번지를 저장함으로써 참조 이루어진다.
									  // 
		double[] doubleArrays; 
		// 배열 변수는 참조 변수에 속한다. 배열도 객체이므로 힙 영역에 생성되고 배열 변수는 힙 영역의 
		// 배열 변수를 참조하게 된다. 
		// 참조할 배열 객체가 없다면 배열 변수는 null 값으로 초기화될 수 있다.
		// ex) 타입[] 변수 = null;
		
		// 8~10월달 까지의 내 월급 합산 
		
		int totalWageResult = totalWage(new int[] {207,203,204});
		
		
		// 배열의 길이를 알아보자
		String[] aclassStudentOfTotal = {"Tom","adward","gosling","albertS"};
		System.out.println(aclassStudentOfTotal.length); // length 필드를 읽으면 된다.
		
		// String[] 배열 항목간에 문자열을 비교할 때는 == 연산자 대신 equals() 메소드를 사용해야한다.
		// == 는 객체 번지 비교이기 때문이다.
		
		
	}
	public static int totalWage(int[] myWage) {
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += myWage[i];
		}
		return sum;
	}
	
	//배열 길이
	/*배열의 길이란 배열에 저장할 수 있는 전체 항목 수를 말한다.필드는 객체 내부의 데이터를 말한다. 
	 * 배열의 length 필드를 읽기 위해서는 배열 변수에 도트(.) 연산자를 붙이고 length 를 적어주면 된다. */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
