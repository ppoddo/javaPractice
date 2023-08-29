package reference;

public class StudentTest {

	public static void main(String[] args) {

		Student studentJames = new Student(100, "james");
		studentJames.setKorea( 100);
		studentJames.setMath( 100);
		
		Student studentTomas = new Student(100, "Tomas");
		studentTomas.setKorea( 60);
		studentTomas.setMath( 60);
	
	
		studentJames.showStudentInfo();
		studentTomas.showStudentInfo();
		
	}

}
