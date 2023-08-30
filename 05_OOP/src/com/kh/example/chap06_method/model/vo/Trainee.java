package com.kh.example.chap06_method.model.vo;

public class Trainee {
	private String name;
	private final String ACADEMY = "KH";	//final이면 변경불가
	private char classRoom;
	private String time;
	
	private static double score;

	
	public Trainee() {}
	public Trainee(String name, char classRoom, String time, double score) {
		this.name = name;
		this.classRoom = classRoom;
		this.time = time;
		Trainee.score = score;	//static이긴 때문에 클래스 주소값(클래스명)으로 명명.
	}
	
	public String inform() {
		return ACADEMY + " " + name + " 훈련생은 " + classRoom
		+ "반 " + time + "이고, " + score + "점입니다.";
	}
	
	public void setName(String name) {
		this.name = name;				//이름을 변경할 수 있는 메소드
	}
	
	public String getName() {
		return name;			// 이름만 호출할 수 있는 메소드
	}
	
	public String getACADEMY() {
		return ACADEMY;			// 학원명만 호출할 수 있는 메소드
	}
	
	public void setClassRoom(char classRoom) {
		this.classRoom = classRoom;		// 클래스룸을 변경할 수 있는 메소드
	}
	
	public char getClassRoom() {
		return classRoom;				// 클래스룸을 호출할 수 있는 메소드
	}
	
	public void setTime(String time) {
		this.time = time;				// 시간을 변경할 수 있는 메소드
	}
	
	public String getTime() {
		return time;					// 시간을 호출할 수 있는 메소드
	}
	
	public static void setScore(double score) {
		Trainee.score = score;			//점수를 변경할 수 있는 메소드
	}
	
	public static double getScore() {
		return score;					//점수를 호출할 수 있는 메소드
	}
	
	
	
	
}
