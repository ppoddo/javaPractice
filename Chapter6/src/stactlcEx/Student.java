package stactlcEx;

public class Student {

	private static int serialNum = 10000;
	
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}

	public static int getSerialNum() {
		int i = 10;  //지역변수
		
		i++;
		System.out.println(i);
		
		
		return serialNum; //static 변수, 클래스 변수
		
		
	}

	
	
}
