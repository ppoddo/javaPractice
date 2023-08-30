package com.kh.example.practice5.run;

import com.kh.example.practice5.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setAddress("서울");
		System.out.println(e.getAddress());
		
		e.setAddress("대구");
		System.out.println(e.getAddress());
	}

}
