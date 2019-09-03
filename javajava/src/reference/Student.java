package reference;

public class Student {
	
	int studentId;
	String studentName;
	
	Subject korea; // 이러한 객체는 생성해서 사용 해야함
	Subject math;
	
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
		
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	// 학생들 점수 보고 싶음
	public void showStudentScore() {
		int total  = korea.score + math.score;
		System.out.println("학생의 총점은 : " + total +" 입니다.");
	}
}
