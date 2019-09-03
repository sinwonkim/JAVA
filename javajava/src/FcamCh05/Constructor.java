package FcamCh05;

public class Constructor {
	/*
	 * 생성자 
	 * 객체를 생성할때 new 키워드와 함께 호출 ( 객체 생성 외에는 호출할 수 없음)
	 * 인스턴스를 초기화 하는 코드가 구현 됨( 주로 멤버 변수 초기화)
	 * 반환 값이 없음, 상속되지 않음
	 * 생성자는 클래스 이름과 동일
	 * 
	 * 기본 생성자 
	 * 하나의 클래스에는 반드시 하나 이상의 생성자가 존재해야 함 
	 * 프래그래머가 생성자를 구현하지 않으면 컴파일러가 생성자 코드를 넣어줌 => 기본 생성자
	 * 기본 생성자는 매개 변수가 없고, 구현부가 없음 
	 * 만약 클래스에 다른 생성자 있을시 기본생성자 생성x
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Student 인스턴스(객체)를 생성하면서 인자로 String 인수인 이순신을 전달 하니깐 Student 생성자도 호출된다.
		/*new Student("이순신");*/
		
		Student student = new Student("이순신");
		Student studentKim = new Student(100,"김유신");
		
		studentKim.showStudentInfo();
		
		
	}

}
