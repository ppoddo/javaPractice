package reference;

public class Student {

	int studentID;
	String studenName;
	Subject korea;
	Subject math;
	
	public Student(int id, String name) {
		studentID = id;
		studenName = name;
		
		korea = new Subject("국어");
		math = new Subject("수학");
	}
	
	public void setKorea(int score) {
		korea.setScore(score);

	}
	public void setMath(int score) {
		math.setScore(score);

	}
	
	public void showStudentInfo() {
		int total = korea.getScore() + math.getScore();
		System.out.println(studenName + "학생의 총점은 "+ total + "점 입니다.");
						
	}

}