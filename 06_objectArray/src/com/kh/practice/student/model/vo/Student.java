package com.kh.practice.student.model.vo;

public class Student {
	private String name;
	private String subject;
	private int score;
	
	public Student() {}		//	기본 생성자
	
	public Student(String name, String subject, int score) {	
		this.name = name;			//3개의 초기값 받는 생성자
		this.subject = subject;
		this.score = score;
	}
	// 정보 호출 및 변경을 위한 게터 세터
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public String inform() {	//Student 클래스 필드의 값들을 모두 반환(return)
		return name + "님의 " + subject + "과목 점수는 " + score + "입니다.";
		
	}

}
