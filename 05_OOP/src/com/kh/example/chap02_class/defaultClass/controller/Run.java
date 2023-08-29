package com.kh.example.chap02_class.defaultClass.controller;

public class Run {
	public static void main(String[] args) {
		DefaultClass dc = new DefaultClass();	// default 클래스여도 같은 패키지라서 호출 가능.
		dc.test();					// 같은 패키지에 있을 땐 당연히 임폴트 안해도 된다.
									// java.lang 패키지 안에 있는 자바기본명령어, 예약어들도 따로 임폴트안해도됨 ㅋㅋ
		

	}
}
