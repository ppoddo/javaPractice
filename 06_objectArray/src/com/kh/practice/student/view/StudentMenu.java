package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	private StudentController ssm = new StudentController();
	
	public StudentMenu() {	//printmenu 메소드를 여기에 넣어서 출력되게 해보자
		
	}
	
	public void printMenu( ) {
		Student[] students = ssm.printStudent();
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].inform());
		}
	}

}
