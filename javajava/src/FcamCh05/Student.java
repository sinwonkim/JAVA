package FcamCh05;

public class Student {
	public int studentId;
	public String studentName;
	public String address;
	
	// 동일한 생성자 이름  메소드 오버로딩 Method Overloadding 
	// 생성자 오버로딩 
	public Student(String name ) {
		studentName  = name;
	
	}
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
		address = "주소 없음";
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + " , " + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
}
