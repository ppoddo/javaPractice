package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	private Student[] sArr = new Student[5];
	
	public static final int CUT_LINE = 60;
	
	public StudentController() {	//기본 생성자 = 값 초기화
		
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
	}
	
	public Student[] printStudent() {	//학생 정보 출력
		return sArr;		// 객체 배열에 있는 데이터 반환
	}
	
	public int sumScore() {			//합산 점수
		int sum = 0;
		for(int i = 0; i < sArr.length; i++) {
			sum += sArr[i].getScore();
		}
		return sum;
	}
	
	public double[] avgScore() {	//평균 점수
		double[] avgScores = new double[sArr.length];
		int sum = sumScore();
		for(int i = 0; i < sArr.length; i++) {
			avgScores[i] = (double) sum/ sArr.length;
		}
		return avgScores;
	}
}
