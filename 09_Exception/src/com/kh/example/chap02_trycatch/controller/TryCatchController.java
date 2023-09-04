package com.kh.example.chap02_trycatch.controller;

import java.io.IOException;

public class TryCatchController {
	public void method1() {
		System.out.println("method1() 호출됨...");
		try {
			method2();
			System.out.println("출력될지 테스트");	
			// method2가 예외가 발생하여서 그 아래 코드는 실행되지 않고 바로 catch문으로 이동
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("예외 발생 아래 코드는 catch문으로 넘어가지만 finally문은 반드시 실행!!");
			// 예외처리를 다 하고 나서 반드시 이 구문을 실행 후 넘어가기
		}
		System.out.println("method1() 종료됨...");
	}

	public void method2() throws IOException {
		System.out.println("method2() 호출됨...");
		throw new IOException("IOException 강제 발생 시켰습니다.");	//예외 메시지를 설정 가능 ㅋㅋ
	//	System.out.println("method2() 종료됨...");
	}
	
	//만약 예외를 넘기는 메소드를 호출한 메소드가 2개이상이면 각각 예외처리를 해줘야함
	// 예외처리 문구는 객체에 담을 수 있고 호출할 수 있으나
	// 그 객체를 임의로 변경하지 못하므로 오버라이딩할 수 없다(오버라이딩과 관계 x)

}
