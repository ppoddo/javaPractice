package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {
	public static void main(String[] args) {
				//static은 다이어그램에서 밑줄로 표현된다!!!!중요
		Member m = new Member();
		m.changeName("홍길동");
		m.printName();
		
	}

}
