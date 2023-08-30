package com.kh.exaple.chap05_constructor.run;

import com.kh.exaple.chap05_constructor.model.vo.User;

public class Run {
	public static void main(String[] args) {
		// new User(); == 기본 생성자로 JVM이 알아서 생성해줌.
		User u1 = new User();	
		u1.inform();
		// 필드를 특정 값으로 초기화하면서 생성하고 싶으면 인자의 값이 매개변수로 전달되어서
		// 각각의 필드에 초기화한다.		
		User u2 = new User("user01", "강건강", 20, 142.3);
		u2.inform();
		
		User u3 = new User("user02", "남나눔", 19);
		u3.inform();
	}

}
