package reference;

public class StudentTest {
	public static void main(String[] args) {
		
		Student  student = new Student(123,"asd");		
		student.setKoreaSubject("국어", 100);
		student.setMathSubject("수학", 90);
		
		Student studentKim = new Student(100,"kim");
		studentKim.setKoreaSubject("국어", 80);
		studentKim.setMathSubject("수학", 85);
		
		student.showStudentScore();
		studentKim.showStudentScore();
	}
}
